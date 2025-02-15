class Solution {
    public int removeElement(int[] nums, int val) {
    int k = 0; 
    for (int m = 0; m < nums.length; m++) {
        if (nums[m] != val) {
            nums[k] = nums[m];
            k++;
        }
    }
    return k;

    }
} 



