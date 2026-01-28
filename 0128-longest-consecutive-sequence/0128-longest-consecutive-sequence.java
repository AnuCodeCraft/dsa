class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int maxLen = 1;

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int value = num;
                while(set.contains(value + 1)) {
                    count++;
                    value++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }
}