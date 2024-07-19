import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,1,4,2};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
    while(i < nums.length) {
        int correct = nums[i] - 1;

        if(nums[i] != nums[correct]) {
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
