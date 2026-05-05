class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;

        for (int num : nums) {
            sum += num;
            if (maxSum < sum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}