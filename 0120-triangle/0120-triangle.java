class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int l = triangle.size();
        int minSum = 0;
        int[] dp = new int[l];

        for (int i = 0; i < l; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (dp[i] > triangle.get(i).get(j))
                    dp[i] = triangle.get(i).get(j);
            }
        }

        for (int i = 0; i < dp.length; i++) {
            minSum += dp[i];
        }

        return minSum;
    }
}
