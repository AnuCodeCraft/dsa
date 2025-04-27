class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; 
        int currentProfit = 0;
        int min = prices[0]; 

        for(int i=1; i<prices.length; i++){
            min = prices[i] < min ? prices[i] : min;
            currentProfit = prices[i] - min;
            maxProfit = currentProfit > maxProfit ? currentProfit : maxProfit; 
        }

        return maxProfit;
        
    }
}