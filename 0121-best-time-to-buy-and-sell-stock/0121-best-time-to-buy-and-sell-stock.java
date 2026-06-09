class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxProfit = 0;
        int min = prices[0];

        for (int price : prices) {
            min = Math.min(price, min);
            profit = price - min;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}