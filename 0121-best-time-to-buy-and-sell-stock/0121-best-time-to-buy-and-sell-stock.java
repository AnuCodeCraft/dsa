class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;
        int min = prices[0];

        for (int price : prices) {
            if (price < min) {
                min = price;
            }

            currentProfit = price - min;

            if (maxProfit < currentProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;

    }
}