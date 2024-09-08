class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String s = "";

        ans = generateAllCombinations(n, n, s, ans);
        return ans;
    }

    public List<String> generateAllCombinations(int left, int right, String s, 
       List<String> answer) {
        
        if (left == 0 && right == 0) answer.add(s);
        if (left > right || left < 0 || right < 0) return answer;

        s += "(";
        generateAllCombinations(left - 1, right, s, answer);
        s = s.substring(0, s.length() - 1);

        s += ")";
        generateAllCombinations(left, right-1, s, answer);
        s = s.substring(0, s.length() - 1); 

        return answer;
    }

}
