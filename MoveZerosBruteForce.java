import java.util.*;

public class MoveZerosBruteForce {


     public static int[] moveZeros(int arr[]) {

    ArrayList<Integer> temp = new ArrayList<>();
    int n = arr.length;

    // 1. arr to temp
    for(int i = 0; i < n; i++) {
        if(arr[i] != 0) {
            temp.add(arr[i]);
        }
    }

    //2. temp to arr only non zero values

    int nonZeroSize = temp.size();
    // get the size of temp array
    // copy elements of temp arr to array
    // fill the first elements with non zeros elements
    for(int i = 0; i < temp.size(); i++) {
        arr[i] = temp.get(i);
    }

    for(int i = nonZeroSize; i < n; i++) {
        arr[i] = 0;
    }

    return arr;
   }
   
    public static void main(String[] args) {
        int[] arrr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] ar = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] ans = moveZeros(arrr);

        for(int i = 0; i < ar.length; i++) {
        System.out.print(ar[i] + " ");
        }
        System.out.println("");

        for(int i = 0; i < ans.length; i++) {
        System.out.print(ans[i] + " ");
        }
        System.out.println("");
        
   }
}

// TC -> O(N) + O(X) + O(N - X)
// O(N) for copying non zero elements of array to temp (in worst case we may need to copy all the elements which may be non zero)
// O(X) for copying non zero elements of temp back to arr
// O(N - X) for copying zero elemtnts back to arr

// so after cancelling the total TC is O(2 * N)
// O(N) for copying non-zero elements from the original to the temporary array. O(X) for again copying it back from the temporary to the original array. O(N-X) for filling zeros in the original array. So, the total time complexity will be O(2*N).

// SC -> O(X) which is equal to O(N) in worst case we may need to copy every element of arr to temp!
// The temporary array stores the non-zero elements. In the worst case, all the given array elements will be non-zero.
