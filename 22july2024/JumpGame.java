

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {23,5,4,6,1};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int finalPosition = nums.length - 1;

        for(int i = nums.length - 2; i >= 0; i--) {
            if(i + nums[i] >= finalPosition) {
                finalPosition = i;
            }
        }

        return finalPosition == 0;
    }
}
