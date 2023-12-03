import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> triplet(int n, int[] arr) {

        HashSet<List<Integer>> set = new HashSet<>();

        // check for possible triplets

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        set.add(temp);
                    }
                }
            }
        }

        // storing the set elements in list
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;

        List<List<Integer>> ans = triplet(n, arr);
        for(List<Integer> it : ans) {
            System.out.println("[");

            for(Integer i : it) {
                System.out.println(i + " ");
            }

            System.out.print("]");
        }
    }
}
