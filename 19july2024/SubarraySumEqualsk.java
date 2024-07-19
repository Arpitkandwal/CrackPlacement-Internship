import java.util.HashMap;
import java.util.Map;
public class SubarraySumEqualsk {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(subarraySum(nums, 2));
    }

    public static int subarraySum(int[] nums, int k) {
        int sum = 0; 
        int ans = 0;

        Map<Integer,Integer> preSum = new HashMap<>();

        preSum.put(0,1);

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(preSum.containsKey(sum - k)) {
                ans += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum,0) + 1);
        }
        return ans;
    }
}
