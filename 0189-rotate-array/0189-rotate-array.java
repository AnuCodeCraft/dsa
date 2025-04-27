class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length-1;
        k = k % nums.length;
        reverse(nums, 0, n);
        reverse(nums, 0, k-1);
        reverse(nums, k, n);
       
    
    }
     public void reverse(int[]nums, int low, int high){
         while(low<high){
         int temp = nums[low];
         nums[low]=nums[high];
         nums[high]= temp;
         low++;
         high--;
         }
     }
}