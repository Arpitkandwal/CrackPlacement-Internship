package CrackPlacement;

import java.util.Arrays;

public class MergeSortedArray {
   public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0}; 
    int[] nums2 = {2,5,6};
    int m = 3;
    int n = 3;
    System.out.println(Arrays.toString(mergeArray(nums1, m, nums2,  n)));
   } 

   static int[] mergeArray(int[] nums1, int m, int[] nums2, int n) {
      int p1 = m - 1; // Last index of nums1 array
      int p2 = n - 1; // Last index of nums2 array
      int p = m + n - 1; // Last index of m + n array;

      while(p1 >= 0 && p2 >= 0) {
         if(nums1[p1] > nums2[p2]) {
            nums1[p] = nums1[p1];
            p1--;
         }
         else {
            nums1[p] = nums2[p2];
            p2--;
         }
         p--;
      }

      while(p2 >= 0) {
         nums1[p] = nums2[p2];
         p2--;
         p--;
      }
      return nums1;
   }
}
