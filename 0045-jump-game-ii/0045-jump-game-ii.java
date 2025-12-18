class Solution {
    public int jump(int[] nums) {
        int n = nums.length - 1; 
        int coverage = 0, lastJumpIndex = 0, totalJumps = 0; 

        if(nums.length == 1) return 0; 

        for(int i = 0; i < n; i++){
            coverage = Math.max(coverage, i + nums[i]);

            if(i == lastJumpIndex){
                lastJumpIndex = coverage;
                totalJumps++;
            }

            if(lastJumpIndex >= n){
                return totalJumps;
            }
        }
        return totalJumps;
    }
}