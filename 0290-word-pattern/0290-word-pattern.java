class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        HashMap<Character, String> map = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);

            if(!map.containsKey(ch)){
                if(!map.containsValue(words[i])){
                    map.put(ch, words[i]);
                }else{
                    return false;
                }
            }else{
                 String value = map.get(ch);
                 if (!value.equals(words[i])) return false;
            }

        }

        return true;
    }
}