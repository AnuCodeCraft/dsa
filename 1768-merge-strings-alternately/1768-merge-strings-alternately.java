class Solution {
    public String mergeAlternately(String word1, String word2) {
       int  i = 0, len1 = word1.length(), len2 = word2.length();
       StringBuilder result = new StringBuilder();

       while(i < len1 || i < len2){
         if(i < len1){
            result.append(word1.charAt(i));
         };
         if(i < len2){
            result.append(word2.charAt(i));
         };
         i++;
       }

       return result.toString();
        
    }
} 

// run single a loop check 
// in each iteration check string is not empty then add one character to new string in case its empty then add all the element of other string 
// can have flag to test that leght is yet not reached