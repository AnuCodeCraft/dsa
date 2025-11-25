class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int n = 1;

        while (n < nums.length) {
            if (nums[k-1] < nums[n]) {
                nums[k++] = nums[n++];
            } else {
                n++;
            }
        }
        return k;
    }
}