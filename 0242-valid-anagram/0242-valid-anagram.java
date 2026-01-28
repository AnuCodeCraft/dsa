class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!charFrequencyMap.containsKey(c))
                return false;
            charFrequencyMap.put(c, charFrequencyMap.get(c) - 1);
            if (charFrequencyMap.get(c) < 0)
                return false;
        }
        return true;
    }
}