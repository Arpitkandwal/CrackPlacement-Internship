import java.util.*;

public class PermutationInArray {
    public static void main(String[] args) {
        long[] a = {2, 1, 3};
        long[] b = { 7, 8, 9 };
        int n = a.length;
        int k = 10;
        System.out.println(isPossible(a, b, n, k));
    }

    public static boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        
        for (int i = 0; i < n / 2; i++) {
            long temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }

        for (int i = 0; i < n; i++)
        if (a[i] + b[i] < k)
            return false;
    
        return true;

    }

}

