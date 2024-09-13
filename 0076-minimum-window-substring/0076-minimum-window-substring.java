class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        if (m < n) return "";
        
        HashMap<Character, Integer> mp = new HashMap<>();
        
        // Build frequency map for characters in t
        for (char x : t.toCharArray()) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        
        int count = mp.size(); // Number of unique characters in t that need to be matched
        int start = 0;
        int ans = Integer.MAX_VALUE;
        int i = 0; // Window start index
        
        for (int j = 0; j < s.length(); j++) {
            char endChar = s.charAt(j);
            
            if (mp.containsKey(endChar)) {
                mp.put(endChar, mp.get(endChar) - 1);
                if (mp.get(endChar) == 0) count--;
            }
            
            // Check if all characters are matched
            while (count == 0) {
                if (ans > j - i + 1) {
                    ans = j - i + 1;
                    start = i;
                }
                
                char startChar = s.charAt(i);
                if (mp.containsKey(startChar)) {
                    mp.put(startChar, mp.get(startChar) + 1);
                    if (mp.get(startChar) > 0) count++;
                }
                
                i++;
            }
        }
        
        return ans == Integer.MAX_VALUE ? "" : s.substring(start, start + ans);
    }
}
