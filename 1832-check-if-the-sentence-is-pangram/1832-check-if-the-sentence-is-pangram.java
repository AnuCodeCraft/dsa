class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26)
            return false;
        Set<Character> uniqueLetters = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            uniqueLetters.add(sentence.charAt(i));
        }
        return uniqueLetters.size() == 26;
    }
}
