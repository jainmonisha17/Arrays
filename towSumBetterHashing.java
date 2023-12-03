import java.util.*;

public class towSumBetterHashing {
    public static String twoSum(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int num = arr[i];
            int needed = target - num;
            if(myMap.containsKey(needed)) {
                return "YES";
            }
            myMap.put(arr[i], i);
        }
        return "NO";
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(arr, target);
        System.out.println("This is the ans for variant 1: " + ans);
    }
    
}
