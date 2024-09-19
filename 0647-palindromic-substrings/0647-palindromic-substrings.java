class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            count += validPalindromeCount(s, i, i);
            count += validPalindromeCount(s, i, i+1);
        }
        return count;
    }

    int validPalindromeCount(String s, int l, int r) {
        int count = 0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            count += 1;
            l -= 1;
            r += 1;
        }
        return count;
    }
}
