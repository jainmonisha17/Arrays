import java.util.*;

public class leftRotateArrByOne {
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        solvee(arr);
    }

    public static void solve(int[] arr) {
        int n = arr.length;
        int temp[] = new int[n];

        for(int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }

        temp[n - 1] = arr[0];

        for(int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void solvee(int[] arr) {
        int n = arr.length;
        int temp[] = new int[arr.length];
        int first = arr[0];

        for(int i = 1; i < arr.length; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = first;
        
        for(int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + "  ");
        }
    }
}

