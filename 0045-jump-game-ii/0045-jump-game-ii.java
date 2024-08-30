class Solution {
    public int jump(int[] nums) {
        int n = nums.length - 1;
        int coverge = 0, lastJumpIndex = 0, totalJumps = 0;

        if (nums.length == 1)
            return 0;

        for (int i = 0; i < n; i++) {
            coverge = Math.max(coverge, i + nums[i]);

            if (i == lastJumpIndex) {
                lastJumpIndex = coverge;
                totalJumps++;
            }
            if (lastJumpIndex >= n) {
                return totalJumps;
            }
        }
        return totalJumps;
    }
}