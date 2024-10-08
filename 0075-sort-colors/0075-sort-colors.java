class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        int temp = 0;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
                    swap(nums, low++, mid++);
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swap(nums, high--, mid);
                    break;
                }
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}