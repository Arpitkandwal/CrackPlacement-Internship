package CrackPlacement;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(ReturnCount(nums));
    }

    static int ReturnCount(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 1; // Start from the second element since the first element is always unique.

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}
