class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String newStr = new String(ch);

            if(!map.containsKey(newStr)){
                map.put(newStr, new LinkedList<>());
            }

            map.get(newStr).add(s);

        };
        return new LinkedList<>(map.values());
    }
}