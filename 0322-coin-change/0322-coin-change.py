class Solution:
    def coinChange(self, coins: list[int], amount: int) -> int:
        n = len(coins)
        dp = [0]*(amount+1)
        dp[0] = 0
        for i in range(1, amount+1):
            dp[i]= float('inf')
            for j in range(0, n):
                if coins[j]<=i:
                    dp[i] = min(dp[i], dp[i-coins[j]]+1)
        
        if dp[amount]==float('inf'):
            return -1
        return dp[amount]