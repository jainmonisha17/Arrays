public class TwoSumBruteAnother {

    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    } 
    
    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 8, 11};
        int target = 14;
        int[] solution = twoSum(arr, target);
        System.out.println("Two sum of variant 2 : [" + solution[0] + " , " + solution[1] + "]");
    }
}
