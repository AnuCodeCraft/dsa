class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = prices[0];
        int currentProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(minValue > prices[i]) minValue = prices[i];
            currentProfit = prices[i] - minValue;
            if(currentProfit > maxProfit) maxProfit = currentProfit;
        }

        return maxProfit;
        
    }
}