public class Bai_3_Buy_And_Sell {
    public int maxProfit(int[] prices) {
            if (prices == null || prices.length <= 1) {
                return 0; // No profit can be made with less than two days' data.
            }
            int minPrice = prices[0];
            int maxProfit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i]; // Update the minimum price if a lower price is encountered.
                } else {
                    maxProfit = Math.max(maxProfit, prices[i] - minPrice);
                }
            }
            return maxProfit;
    }
}
