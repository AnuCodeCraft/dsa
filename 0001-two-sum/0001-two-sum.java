class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = {-1, -1};
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int difference = target - nums[i];

            if(map.containsKey(difference)){
                arr[0] = map.get(difference);
                arr[1] = i;
                break;
            }else{
              map.put(nums[i], i);
            }

        }

        return arr;
    }
}