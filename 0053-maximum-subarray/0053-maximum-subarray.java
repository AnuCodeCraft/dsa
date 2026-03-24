class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = 0;
        int maxSum = 0;

        for(int i = 0; i< nums.length; i++){
            currMax = Math.max(nums[i], nums[i]+currMax);
            maxSum = Math.max(currMax, maxSum);
        }

        return maxSum;
    }
}