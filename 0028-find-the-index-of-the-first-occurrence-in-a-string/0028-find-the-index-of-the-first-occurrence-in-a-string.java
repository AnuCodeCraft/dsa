class Solution {
    public int strStr(String haystack, String needle) {

        int len = haystack.length() - needle.length();
        for (int i = 0; i <= len; i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (needle.length() == j) {
                return i;
            }

        }

        return -1;
    }
}
