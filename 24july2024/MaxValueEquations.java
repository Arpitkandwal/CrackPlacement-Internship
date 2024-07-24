import java.util.*;

public class MaxValueEquations {
    public static void main(String[] args) {
        int[][] points = {{1,3}, {2,0}, {5,10}, {6, -10}};
        int k = 1;
        System.out.println(findMaxValueOfEquation(points, k));
    }

    public static int findMaxValueOfEquation(int[][] points, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int ans = Integer.MIN_VALUE;
        for (int i = 0 ; i < points.length; i++) {
            // pick the index at the front of deque and if the difference between current x           
            // and x in peeked index is greater than k then we dont need the peeked value in deque
            // so remove it using poll
            while (!q.isEmpty() && points[i][0] - points[q.peek()][0] > k)
                q.poll();
            // now the difference of current point's x and x of the front index of deque will be <= k
            // so calculate ans
            if (!q.isEmpty())
                ans = Math.max(ans, points[i][0] + points[i][1] + points[q.peek()][1] - points[q.peek()][0]);
            // if the non checked values i.e. the difference of y - x of indexes at the end of deque is smaller
            // than current y - x then we don't need those values as we already have the greater value so 
            // remove the indexes from end using pollLast()
            while (!q.isEmpty() && points[q.peekLast()][1] - points[q.peekLast()][0] < points[i][1] - points[i][0])
                q.pollLast();
            // add current index to the end of deque
            q.addLast(i);
        }
        return ans;
    }
}
