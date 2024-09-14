class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int profit = 0, maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minSoFar) {
                minSoFar = prices[i];
            };

            profit = prices[i] - minSoFar;
            
            if (profit > maxProfit) {
                maxProfit = profit;
            };
        }

        return maxProfit;

    }
}