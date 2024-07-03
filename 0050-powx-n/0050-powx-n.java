class Solution {
    public double myPow(double x, int n) {
        long N = n;  // Use long to handle edge case when n is Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return power(x, N);
    }

    private double power(double x, long n) {
        double result = 1.0;
        double currentProduct = x;
        while (n > 0) {
            if ((n % 2) == 1) { // If n is odd
                result *= currentProduct;
            }
            currentProduct *= currentProduct; // Square the current product
            n /= 2; // Divide n by 2
        }
        return result;
    }

}