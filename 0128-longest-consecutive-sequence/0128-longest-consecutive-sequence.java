class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0) return 0;
        
        Set<Integer> set = new HashSet<>();
        int maxLen = 1;

        for(int num: nums){
            set.add(num);
        };

        for (int ele : set) {
            if (!set.contains(ele - 1)) {
                int curLen = 1;
                int num = ele;
                
                while (set.contains(num + 1)) {
                    num++;
                    curLen++;
                };

                if (curLen > maxLen){
                maxLen = curLen;
            }
            };
        };

        return maxLen;
    }
}