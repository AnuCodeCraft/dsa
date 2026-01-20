class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        // reverse
        for (int k = 0; k < n; k++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int temp = matrix[k][l];
                matrix[k][l] = matrix[k][r];
                matrix[k][r] = temp;
                l++;
                r--;
            }
        }

    }
}