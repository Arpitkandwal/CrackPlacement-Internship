
public class ContainerWithMostWater {
    public static void main(String[] args) {
       int[] height = {1,8,6,2,5,4,8,3,7};
       System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int li = 0;
        int ri = height.length - 1;

        int result = 0;

        while(li < ri) {
           int left = height[li];
           int right = height[ri];

           int area = Math.min(left,right) * (ri - li);
           result = Math.max(area,result);

           if(left < right) {
            li++;
           }
           else {
            ri--;
           }
        }
        return result;
    }
}
