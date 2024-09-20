class Solution {
    public int findFinalValue(int[] nums, int original) {

        for (int num : nums) {
            if (num == original) {
                original = original * 2;
            }
        }

        return original;
    }
}