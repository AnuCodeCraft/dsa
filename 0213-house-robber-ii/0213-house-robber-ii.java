class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }

        int pick = nums[0];
        int notpick = 0;
        for(int i=1; i<n-1; i++){
            int newpick = notpick+nums[i];
            int newnotpick = Math.max(pick, notpick);

            pick = newpick;
            notpick = newnotpick;
        }
        int a = Math.max(pick, notpick);
        pick = nums[1];
        notpick = 0;

        for(int i=2; i<n; i++){
            int newpick = notpick+nums[i];
            int newnotpick = MAth.max(pick, notpick);

            pick = newpick;
            notpick = newnotpick;
        };
        int b = Math.max(pick, notpick);
        return Math.max(a,b);
    }
}