class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum = 0;
        int max_sum = nums[0];

        for(int i=0; i<nums.length; i++){
            curr_sum = curr_sum + nums[i];

            if(curr_sum > max_sum){
                max_sum = curr_sum;
            };
            
            if(curr_sum <= 0){
                curr_sum = 0;
            };
        }
       
      return max_sum;
        
    }
}