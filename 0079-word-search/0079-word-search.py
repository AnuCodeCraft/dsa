class Solution:

    def solve(self, i, j, n, m, board, mp, ind, word, mask):

        # Out of bounds
        if i < 0 or i >= n or j < 0 or j >= m:
            return False

        # Current character doesn't match
        if board[i][j] != word[ind]:
            return False

        # Convert cell to a unique number
        cell = i * m + j

        # Check whether this cell is already visited
        if mask & (1 << cell):
            return False

        # We found the complete word
        if ind == len(word) - 1:
            return True

        # Memoization key
        key = (i, j, ind, mask)

        if key in mp:
            return mp[key]

        # Mark current cell as visited
        mask = mask | (1 << cell)

        # Explore all 4 directions
        ans = (
            self.solve(i + 1, j, n, m, board, mp, ind + 1, word, mask)
            or self.solve(i - 1, j, n, m, board, mp, ind + 1, word, mask)
            or self.solve(i, j + 1, n, m, board, mp, ind + 1, word, mask)
            or self.solve(i, j - 1, n, m, board, mp, ind + 1, word, mask)
        )

        mp[key] = ans

        return ans

    def exist(self, board: list[list[str]], word: str) -> bool:

        n = len(board)
        m = len(board[0])

        mp = {}

        for i in range(n):
            for j in range(m):

                if board[i][j] == word[0]:

                    if self.solve(
                        i, j, n, m, board, mp, 0, word, 0
                    ):
                        return True

        return False