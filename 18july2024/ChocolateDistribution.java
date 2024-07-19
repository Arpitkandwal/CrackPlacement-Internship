import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistribution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        System.out.println(findMinDiff(list, list.size(), 5));
    }

    static public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        
        long minDiff = Long.MAX_VALUE;
        
        for(int i = 0; i <= n - m; i++) {
            
            long currentDiff = a.get(i + m - 1) - a.get(i);
            
            if(currentDiff < minDiff) {
                minDiff = currentDiff;
            }
        }
        
        return minDiff;
        
    }
}
