class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, maxProfit = 0;
        int minValue = prices[0];

        for (int price : prices) {
            if (minValue > price)
                minValue = price;
            profit = price - minValue;
            if (maxProfit < profit)
                maxProfit = profit;
        }
        return maxProfit;
    }
}