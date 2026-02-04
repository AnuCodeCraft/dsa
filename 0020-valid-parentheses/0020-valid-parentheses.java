class Solution {
    public boolean isValid(String s) {
        Stack<Character> patterns = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                patterns.add(')');
            } else if (c == '{') {
                patterns.add('}');
            } else if (c == '[') {
                patterns.add(']');
            } else if (patterns.isEmpty() || patterns.pop() != c) {
                return false;
            }
        }

        return true;

    }
}