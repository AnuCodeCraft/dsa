class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = { -1, -1 };

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];

            if (map.containsKey(value)) {
                int index = map.get(value);
                result[0] = index;
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}