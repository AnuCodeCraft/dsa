class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, curSum = 0;

        for (int num : nums) {
            curSum = Math.max(num, curSum + num);
            maxSum = Math.max(curSum, maxSum);
        };
        return maxSum;
    }
}