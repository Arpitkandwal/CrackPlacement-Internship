import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        // System.out.println(findDuplicate(nums));
        System.out.println(findAllDuplicate(nums));
    }

   static public int findDuplicate(int[] nums) {
    int i = 0;

    while(i < nums.length) {
        if(nums[i] != i + 1) {
            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            }
            else {
                return nums[i];
            }
        }
        else {
            i++;
        }
    }

    return -1;
   }

   static ArrayList<Integer> findAllDuplicate(int[] nums) {
    int i = 0;
    while(i < nums.length) {
        int correct = nums[i] - 1;

        if( nums[i] != nums[correct]) {
            swap(nums, i, correct);
        }
        else {
            i++;
        }
    }

    ArrayList<Integer> list = new ArrayList<>();

    for(int index = 0; index < nums.length; index++) {
        if(nums[index] != index + 1) {
            list.add(nums[index]);
        }
    }
    return list;

   }

   static void swap(int[] nums, int first, int second) {
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
   }
}
