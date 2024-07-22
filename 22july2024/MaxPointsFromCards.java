
public class MaxPointsFromCards {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(cardPoints, k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int sum = 0;

        for(int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        int ans = sum;
        int index = k - 1;
        int j = cardPoints.length;

        while(index >= 0) {
            sum = sum - cardPoints[index];
            index--;
            sum = sum + cardPoints[j - 1];
            j--;
            ans = Math.max(ans,sum);
        }

        return ans;
    }
}
