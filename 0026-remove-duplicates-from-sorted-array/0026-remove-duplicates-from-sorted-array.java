class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1) return nums.length;

        int k = 0; 
        for(int i=1; i <= nums.length-1; i++){
            if(nums[i] != nums[k]){
                 k++;
                 nums[k] = nums[i];
            }
        }

        return k+1;
    }
}

// k = 0 = 1
// i = 1 = 1 
// nums 

// k = 1 = 1
// i = 2 = 2