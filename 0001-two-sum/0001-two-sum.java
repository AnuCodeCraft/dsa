class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = {-1, -1};

        for(int i = 0; i < nums.length; i++){
            int requiredNum = target - nums[i];

            if(map.containsKey(requiredNum)){
                result[0] = i;
                result[1] = map.get(requiredNum);
            }else{
                map.put(nums[i], i);
            }
        }
        
        return result;
    }
}


