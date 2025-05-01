class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; 
        int[] res = new int[n];
        int right = 1;

        res[0] = 1;
        for(int i=1; i<n; i++){
            res[i] = nums[i-1] * res[i-1];
        } 


        for(int j=n-1; j>=0; j--){
            res[j] *= right;
            right *= nums[j];
        }


        return res;
        
    }
}