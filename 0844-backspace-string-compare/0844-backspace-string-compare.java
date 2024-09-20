class Solution {
    public boolean backspaceCompare(String s, String t) {
        int len1 = s.length()-1; 
        int len2 = t.length()-1; 

        while(len1 >= 0 || len2 >= 0 ){
            len1 = getNextValidIndex(s, len1);
            len2 = getNextValidIndex(t, len2);

            if(len1 >= 0 && len2 >= 0 && s.charAt(len1) != t.charAt(len2)){
                return false;
            };

            if((len1 < 0 && len2 >= 0) || (len2 < 0 && len1 >= 0)){
                return false;
            };

            len1--;
            len2--;
        }

        return true;
    }

    private int getNextValidIndex(String str, int index){
        int backSpaceCount = 0; 

        while(index >= 0){
            if(str.charAt(index) == '#'){
                backSpaceCount++;
            }else if(backSpaceCount > 0){
                backSpaceCount--;
            }else{
                return index;
            }
            index--;
        }; 

        return index;
    }
}