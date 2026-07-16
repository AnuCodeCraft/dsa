class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum = 0, rightSum = 0;

        for(int i = 0; i < n; i++){
            rightSum += nums[i];
        } 

        for(int j = 0; j < n; j++){
            rightSum -= nums[j];

            if(leftSum == rightSum){
                return j;
            }  
            leftSum += nums[j];
        }
        return -1;
    }
}