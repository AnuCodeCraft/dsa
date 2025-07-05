class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int targetIndex = n - 1; 

        for(int i = n - 1; i >= 0; i--){
           if(i + nums[i] >= targetIndex){
              targetIndex = i;
           }
        }
        return targetIndex == 0;
    }
}