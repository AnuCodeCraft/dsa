class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;

        // clean the array
        for (int i = 0; i < len; i++) {
            if (nums[i] > len || nums[i] <= 0) {
                nums[i] = len + 1;
            }
        }

        // Mark the presence 
        for (int j = 0; j < len; j++) {
            int num = Math.abs(nums[j]);
            if (num > len)
                continue;

            if (nums[num - 1] > 0) {
                nums[num - 1] = -nums[num - 1];
            }
        }

        // loop the frist missing number
        for (int k = 0; k < len; k++) {
            if (nums[k] > 0) {
                return k +1;
            }
        }

        return nums.length + 1;
    }
}
