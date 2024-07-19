package CrackPlacement;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(ans(nums)));
        
    }

    static int[] ans(int[] nums) {
        if(nums.length == 0) return nums;

        int currentIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[currentIndex] = nums[i];
                currentIndex++;
            } 
        }

        while(currentIndex < nums.length) {
            nums[currentIndex] = 0;
            currentIndex++;
        }

        return nums;
    }
}
