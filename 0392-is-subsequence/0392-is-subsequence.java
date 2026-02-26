class Solution {
    public boolean isSubsequence(String s, String t) {
        int slen = s.length();
        int tlen = t.length();

        if (slen <= 0 ) {
            return true;
        }

        int j = 0;
        for (int i = 0; i < tlen; i++) {
            if (j < slen && s.charAt(j) == t.charAt(i)) {
                j++;
            }

            if (j == slen) {
                return true;
            }
        }
        ;

        return false;
    }
}