class Solution {
    public int[] searchRange(int[] nums, int target) {

        int left = findLeftIndex(nums, target);
        int right = findRightIndex(nums, target);

        return new int[] { left, right };
    }

    private int findLeftIndex(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1; 
        int left = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                left = mid;
                high = mid - 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }

        return left;
    }

    private int findRightIndex(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int right = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                right = mid;
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }

        return right;
    }
}