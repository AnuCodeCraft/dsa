class Solution {
    public void moveZeroes(int[] nums) {
        int low = 0;
        int len = nums.length -1;

        for(int i=low; i<=len; i++){
            if(nums[i] != 0){
                nums[low++] = nums[i];
            }
        }

        for(int j=low; j<=len; j++){
            nums[j] = 0;
        }

    }
}
