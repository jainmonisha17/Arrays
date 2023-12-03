import java.util.*;

public class TwosumBrute {

    public static String twoSum(int[] arr, int target) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(arr, target);
        System.out.print("This is the answer for 2 sum" + ans);
    }
}
