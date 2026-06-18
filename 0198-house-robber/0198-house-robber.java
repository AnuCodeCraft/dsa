class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n < 2) return nums[0];
        

        int[] result = new int[n];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < n; i++){
            result[i] = Math.max(nums[i] + result[i -2], result[i-1]);
        }

        return result[n -1];
    }
}


