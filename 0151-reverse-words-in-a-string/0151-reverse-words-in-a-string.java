class Solution {
    public String reverseWords(String s) {
        String words[] = s.trim().split("\\s+"); 
        int len = words.length-1;
        StringBuilder result = new StringBuilder();

        for(int i = len; i >= 0; i--){
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString(); 
    }
}