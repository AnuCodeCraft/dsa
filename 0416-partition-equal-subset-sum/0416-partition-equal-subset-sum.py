class Solution:
    def solve(self,nums, n, i, curr_sum, rem_sum, dp):
        if curr_sum==rem_sum:
            return True
        if i>=n:
            if curr_sum!=rem_sum:
                return False
        if dp[i][curr_sum]!=-1:
            return dp[i][curr_sum]
        ans = self.solve(nums, n, i+1, curr_sum+nums[i], rem_sum-nums[i], dp) or self.solve(nums, n, i+1, curr_sum, rem_sum, dp)
        dp[i][curr_sum]=ans
        return ans


    def canPartition(self, nums: list[int]) -> bool:
        n = len(nums)
        total = sum(nums)
        # dp = [[[-1 for j in range(total+1)]for k in range(total+1)] for i in range(n+1)]
        dp = [[-1 for i in range(total+1)] for j in range(n+1)]
        return self.solve(nums, n, 0, 0, total, dp)
