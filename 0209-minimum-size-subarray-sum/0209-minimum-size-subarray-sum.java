class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0;
        int currMinLen = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (high < nums.length) {
            sum += nums[high];
            high++;

            while (sum >= target) {
                currMinLen = high - low;
                minLen = Math.min(currMinLen, minLen);
                sum -= nums[low];
                low++;
            }

        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}