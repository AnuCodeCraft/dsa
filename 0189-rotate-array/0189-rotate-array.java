class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l;
        reverse(0, l-1, nums);
        reverse(0, k-1, nums);
        reverse(k, l-1, nums);
    }

    private void reverse(int left, int right, int[] nums){
         while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
         }
    }
}