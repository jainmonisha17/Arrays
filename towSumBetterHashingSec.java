import java.util.*;

public class towSumBetterHashingSec {
    
    public static int[] twoSum(int n, int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int num = arr[i];
            int needed = target - num;
            if(myMap.containsKey(needed)) {
                ans[0] = myMap.get(needed);
                ans[1] = i;
            }
            myMap.put(arr[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                           + ans[1] + "]");
    } 
}
