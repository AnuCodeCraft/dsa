class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int currLen = 0;
        int high = 0, low = 0;

        while (high < nums.length) {
            sum += nums[high];
            high++;

            while (sum >= target) {
                currLen = high - low;
                minLen = Math.min(minLen, currLen);
                sum -= nums[low];
                low++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }
}
