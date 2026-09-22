class Solution:
    def solve(self, i, j, n, m, grid, dp):
        if i<0 or i>=n or j<0 or j>=m:
            return float('inf')
        if i==n-1 and j==m-1:
            return grid[i][j]
        if dp[i][j]!=-1:
            return dp[i][j]
        ans= grid[i][j]+min(self.solve(i+1, j, n, m, grid, dp), 
        self.solve(i, j+1, n, m, grid, dp))
        dp[i][j]=ans
        return dp[i][j]

    def minPathSum(self, grid: list[list[int]]) -> int:
        n = len(grid)
        m = len(grid[0])
        dp = [[-1]*m for i in range(n)]
        return self.solve(0, 0, n, m, grid, dp)