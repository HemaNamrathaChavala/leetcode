class Solution {
    public int maxProfit(int[] prices) {
        
int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // if today's price is lower, it becomes the new best buy price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // profit if we sell today
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;

    }
}
