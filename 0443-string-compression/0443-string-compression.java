class Solution {
    public int compress(char[] chars) {
        String str = "";
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                str = count == 1 ? str + String.valueOf(chars[i - 1]) : str + String.valueOf(chars[i - 1]) + count;
                count = 1;
            }
        }
        str = count == 1 ? str + String.valueOf(chars[chars.length - 1])
                : str + String.valueOf(chars[chars.length - 1]) + count;
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return str.length();
    }
}