class Solution:
    def canPartition(self, nums: list[int]) -> bool:
        # key here is the reverse loop from target->num, it prevents the same number from being counted multiple times within the same loop
        total_sum = sum(nums)
        n = len(nums)
        target = total_sum//2
        if total_sum%2!=0:
            return False
        dp = [False]*(target+1)
        dp[0]=True
        for num in nums:
            for cur_sum in range(target, num-1, -1):
                dp[cur_sum] = dp[cur_sum] or dp[cur_sum-num]
        return dp[target]