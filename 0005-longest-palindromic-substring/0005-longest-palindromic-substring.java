class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }
        
        int len = s.length();
        String LPS = "";
        for(int i = 0; i<s.length(); i++){

            String palindrome = "";
            int low = i;
            int high = i;
            
            // odd length
            while(low >= 0 && high < len && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
            }
            palindrome = s.substring(low+1, high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }


            // even length
            low = i - 1;
            high = i;
            while(low >= 0 && high < len && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
            }
            palindrome = s.substring(low+1, high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }
        }
        return LPS;
    }
}
