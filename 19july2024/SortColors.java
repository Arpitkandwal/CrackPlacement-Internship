import java.util.Arrays;

// package 19july2024;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(nums));    
        sortColors(nums);    
    }

    // method two
    static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }

            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, high);
                high--;
            }
        }


    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    // method one
    static int[] sort(int[] nums) {
        int zeroes = 0, ones = 0, n = nums.length;

        for(int num : nums) {
            if(num == 0) zeroes++;
           else if(num == 1) ones++;
        }

        for(int i = 0; i < zeroes; i++) {
            nums[i] = 0;
        }

        for(int i = zeroes; i < zeroes + ones; i++) {
            nums[i] = 1;
        }

        for(int i = zeroes + ones; i < n; i++) {
            nums[i] = 2;
        }

        return nums;
    }
} 
