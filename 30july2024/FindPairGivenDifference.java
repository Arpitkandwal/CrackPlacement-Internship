import java.util.*;

public class FindPairGivenDifference {
    public static void main(String[] args) {
        int[] arr = {5, 20, 3, 2, 5, 80};
        int n = 6;
        int x = 78;
        System.out.println(findPair(n, x, arr));
    }

    public static int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int i = 0;
        int j = 1;
        
        while (i < n && j < n) {
            if (i != j && Math.abs(arr[i] - arr[j]) == x) {
                return 1;
            } else if (arr[j] - arr[i] < x) {
                j++;
            } else {
                i++;
            }
        }
        
        return -1;
    }
}
