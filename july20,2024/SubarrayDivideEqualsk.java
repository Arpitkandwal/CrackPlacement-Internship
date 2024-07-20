import java.util.HashMap;
import java.util.Map;

public class SubarrayDivideEqualsk {
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        System.out.println(subarrayCount(arr, 5));
    }

    static int subarrayCount(int[] nums, int k){
        int sum = 0;
        int ans = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int num : nums) {
            sum += num;
            int remainder = (sum % k + k) % k; // Adjust remainder to be within [0, k-1]
            if (preSum.containsKey(remainder)) {
                ans += preSum.get(remainder);
            }
            preSum.put(remainder, preSum.getOrDefault(remainder, 0) + 1);
        }

        return ans;
    
    }
}
