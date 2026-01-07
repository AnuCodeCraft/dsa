class Solution {
    public boolean isSubsequence(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        
        if (slen == 0) return true;

        int i = 0;
        for (int j = 0; j < tlen; j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                if (i == slen) return true;
            }
        }
        
        return false;
    }
}
