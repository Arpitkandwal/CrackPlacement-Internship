import java.util.*;

public class MinimumSwapsToSort {
    public static void main(String[] args) {
        int[] nums = {2, 8, 5, 4};
        System.out.println(minSwaps(nums));
    }

    public static int minSwaps(int nums[])
    {
        // Code here
        Map<Integer, Integer> map = new HashMap<>();

        int[] numSorted = nums.clone();
        Arrays.sort(numSorted);

        for(int i = 0; i < numSorted.length; i++) {
            map.put(numSorted[i], i);
        }

        int swap = 0;
        int i = 0;

        while(i < nums.length) {
            if(map.get(nums[i]) == i) {
                i++;
            }
            else {
                swap(nums, i, map.get(nums[i]));
                swap++;
            }
        }
        return swap;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
}
