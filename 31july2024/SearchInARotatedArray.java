public class SearchInARotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n-1;

        while(l < h){
            int mid = l + (h-l)/2;

            if(nums[mid] > nums[h]){
                l = mid+1;
            }
            else{
                h = mid;
            }
        }

        int pivotIndex = h;

        if(target == nums[pivotIndex]) return pivotIndex;
        
        int left = find(nums, 0, pivotIndex-1, target);
        int right = find(nums, pivotIndex+1, n-1, target);

        if(left == -1) return right;
        if(right == -1) return left;
        return -1; // not reachable
    }

    public static int find(int[] nums, int start, int end, int target){

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }
}
