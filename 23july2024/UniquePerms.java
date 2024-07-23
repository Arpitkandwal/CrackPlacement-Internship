import java.util.*;

public class UniquePerms {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2));
        ArrayList<ArrayList<Integer>> result = uniquePerms(arr, arr.size());
        System.out.println(result);
    }
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        if (arr == null || arr.size() == 0) {
            return resultList;
        }
        // Convert ArrayList to int array for sorting
        int[] nums = arr.stream().mapToInt(i -> i).toArray();
        Arrays.sort(nums);

        // Call the backtrack function
        backtrack(resultList, new ArrayList<>(), nums, new boolean[nums.length]);

        return resultList;
    }

    private static void backtrack(ArrayList<ArrayList<Integer>> resultList, ArrayList<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue; // Skip duplicates
            used[i] = true;
            tempList.add(nums[i]);
            backtrack(resultList, tempList, nums, used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }


}
