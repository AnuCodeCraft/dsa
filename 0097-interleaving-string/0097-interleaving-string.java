class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int k = s3.length() - 1;

        while (k >= 0) {
            if (j >= 0 && s3.charAt(k) == s2.charAt(j)) {
                k--;
                j--;
            } else if (i >= 0 && s3.charAt(k) == s1.charAt(i)) {
                k--;
                i--;
            } else {
                return false;
            }
        }
        return i < 0 && j < 0 && k < 0;
    }
}
