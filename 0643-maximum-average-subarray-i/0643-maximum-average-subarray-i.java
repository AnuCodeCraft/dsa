class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;

        if(n <= 1){}

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        int max_sum = sum;

        for(int j = k; j < n; j++){
            sum += nums[j];
            sum -= nums[j - k];
            max_sum = Math.max(max_sum, sum);
        }

        return (double) max_sum/k;

    }
}