import java.util.*;

public class ThreeSumBetter {
    
    public static List<List<Integer>> triplet(int n, int[] arr) {
        HashSet<List<Integer>> tripletSet = new HashSet<>();

        for(int i = 0; i < n; i++) {
            HashSet<Integer> mySet = new HashSet<>();
            for(int j = i + 1; j < n; j++) {
                int k = -(arr[i] + arr[j]);

                if(mySet.contains(k)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], k);
                    temp.sort(null);
                    tripletSet.add(temp);
                }
                mySet.add(arr[j]);
            }
        }
    
        List<List<Integer>> ans = new ArrayList<>(tripletSet);
        return ans;
    }


     public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
    

