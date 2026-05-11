class Solution {
    public boolean isValid(String s) {
        Stack<Character> patterns = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                patterns.push(')');
            } else if (c == '[') {
                patterns.push(']');
            } else if (c == '{') {
                patterns.push('}');
            } else if (patterns.isEmpty() || patterns.pop() != c) {
                return false;
            }
        }
        return patterns.isEmpty();
    }
}