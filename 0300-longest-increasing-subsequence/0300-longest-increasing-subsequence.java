class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxIndex = 0, l = nums.length;
        int[] dp = new int[l];

        for(int i=1; i<l; i++){
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                   if(dp[j]+1 > dp[i]) dp[i] = dp[j]+1;
                }
            }
        }; 

        for(int j=0; j<l; j++){
            if(dp[maxIndex] < dp[j]) maxIndex = j;
        }; 

        return dp[maxIndex]+1;
    }
}


