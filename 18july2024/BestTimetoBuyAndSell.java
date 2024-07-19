
public class BestTimetoBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,3,4,5,6};
        System.out.println(bestTime(prices));
    }

    static int bestTime(int[] prices) {
        if(prices.length == 0) return -1;
        int leastBuy = Integer.MAX_VALUE;
        int cProfit = 0;
        int totalProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(leastBuy > prices[i]) {
                leastBuy = prices[i];
            }

            cProfit = prices[i] - leastBuy;
            if(cProfit > totalProfit) {
                totalProfit = cProfit;
            }
        }
        return totalProfit;
    }
}
