class Solution {
    public int trap(int[] height) {
        int len = height.length; 
        if(len == 0) return 0;

        int waterTrapped = 0;
        int maxLeft = height[0], maxRight = height[len-1];
        int left = 0, right = len-1;

        while(left <= right){
            if(maxLeft >= maxRight){
                int value = height[right];
                if(maxRight < value) maxRight = value;
                else waterTrapped += maxRight - value;
                right--;  
            }else{
                int value = height[left];
                if(maxLeft < value) maxLeft = value;
                else waterTrapped += maxLeft - value;
                left++;  
            }
        }
        return waterTrapped;
    }
}