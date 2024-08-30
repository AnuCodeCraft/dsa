class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length - 1;
        int targetNumIndex = n;

        for (int i = n-1; i >= 0; i--) {
            if (targetNumIndex <= i + nums[i]) {
                targetNumIndex = i;
            }
        }

        return targetNumIndex == 0;

    }
}