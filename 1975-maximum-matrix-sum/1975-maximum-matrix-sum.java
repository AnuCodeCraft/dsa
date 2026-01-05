class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        long totalSum = 0;
        int negativeCount = 0;
        int minAbsValue = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = matrix[i][j];
                totalSum += Math.abs(value);
                if (value < 0) {
                    negativeCount++;
                }
                minAbsValue = Math.min(minAbsValue, Math.abs(value));
            }
        }

        if (negativeCount % 2 == 0) {
            return totalSum;
        } else {
            return totalSum - (2 * minAbsValue);
        }

    }
}

// What this code does?
// Iterates over every element of the matrix.
// Converts each value to its absolute value and adds it to totalSum.
// Counts how many numbers in the matrix are negative.
// Tracks the smallest absolute value in the entire matrix.
// Uses the fact that sign flips affect negatives in pairs.
// If the number of negative values is even, all numbers can be made positive.
// In that case, returns the sum of all absolute values.
// If the number of negative values is odd, one value must stay negative.
// To minimize loss, subtracts 2 × (smallest absolute value) from the total.
// Returns the maximum possible matrix sum after optimal sign flips.