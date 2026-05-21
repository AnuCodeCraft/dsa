class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx = searchRow(matrix, target);
        if (rowIdx != -1) {
            return binarySearch(matrix, rowIdx, target);
        }
        return false;
    }

    public int searchRow(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        int idx = matrix[0].length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid][0] <= target && matrix[mid][idx] >= target) {
                return mid;
            } else if (matrix[mid][0] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public boolean binarySearch(int[][] matrix, int row, int target) {
        int low = 0;
        int high = matrix[row].length -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

}
