class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null)
            return "";

        String prefix = strs[0];

        for (String str : strs) {
            if (str.length() < prefix.length()) {
                prefix = str;
            }
        }

        for (String str : strs) {
            while (!str.startsWith(prefix)) {
                if (prefix.length() == 0)
                    return "";
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}