class Solution {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0)
            return;
        int m = board.length, n = board[0].length;

        // Iterate through the board cell by cell.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int lives = liveNeighbors(board, m, n, i, j);

                // Rule 1 or Rule 3: Any live cell with 2 or 3 live neighbors lives on to the
                // next generation.
                if (board[i][j] == 1 && (lives == 2 || lives == 3)) {
                    board[i][j] = 3; // Make the 2nd bit 1: 01 ---> 11
                }
                // Rule 4: Any dead cell with exactly 3 live neighbors becomes a live cell.
                if (board[i][j] == 0 && lives == 3) {
                    board[i][j] = 2; // Make the 2nd bit 1: 00 ---> 10
                }
            }
        }

        // Update the board to the next state.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] >>= 1; // Shift right to get the 2nd bit, which is the next state.
            }
        }
    }

    // Helper function to count live neighbors.
    private int liveNeighbors(int[][] board, int m, int n, int i, int j) {
        int lives = 0;
        for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
            for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
                lives += board[x][y] & 1; // Check the current state (1st bit).
            }
        }
        lives -= board[i][j] & 1; // Exclude the cell itself.
        return lives;
    }
}
