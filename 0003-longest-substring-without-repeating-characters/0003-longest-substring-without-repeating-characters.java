class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = Integer.MIN_VALUE, left = 0;
        Set<Character> set = new HashSet<>(); 

        for(int right = 0; right < s.length(); right++){
            
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }  
}