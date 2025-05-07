class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder filteredString = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(Character.toLowerCase(c));
            }
        }
        
        int start = 0;
        int end = filteredString.length() - 1;
        while (start < end) {
            if (filteredString.charAt(start) != filteredString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}