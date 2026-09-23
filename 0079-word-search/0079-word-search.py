class Solution:
    def solve(self, i, j, n, m, board, mp, word, ind, mask):
        if i<0 or i>=n or j<0 or j>=m or board[i][j]!=word[ind]:
            return False
        
        cell = i*m+j
        if mask & 1<<cell:
            return False
        
        if ind==len(word)-1:
            return True
        
        key = (i, j, ind, mask)
        if key in mp:
            return mp[key]
        mask = mask | 1<<cell
        ans = (
            self.solve(i+1, j, n, m, board, mp, word, ind+1, mask)
            or self.solve(i-1, j, n, m, board, mp, word, ind+1, mask)
            or self.solve(i, j+1, n, m, board, mp, word, ind+1, mask)
            or self.solve(i, j-1, n, m, board, mp, word, ind+1, mask)
        )
        mp[key]=ans
        return ans



    def exist(self, board: list[list[str]], word: str) -> bool:
        n = len(board)
        m = len(board[0])
        mp = {}
        for i in range(n):
            for j in range(m):
                if board[i][j]==word[0]:
                    if self.solve(i, j, n, m, board, mp, word, 0, 0):
                        return True
        return False