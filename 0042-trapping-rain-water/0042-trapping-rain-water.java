class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        if(n == 0) return 0 ; 
        
        int maxLeft = 0, maxRight = 0;
        int left = 0, right = n-1;
        int res = 0;
        
        while(left <= right){
            if(height[right] <= height[left]){
                if(height[right] > maxRight) maxRight = height[right];
                else res += maxRight - height[right];
                
                right--;
                
            }else{
                if(height[left] > maxLeft) maxLeft = height[left];
                else res += maxLeft  - height[left];
                
                left++;
            }
        }
        return res;
    }
}