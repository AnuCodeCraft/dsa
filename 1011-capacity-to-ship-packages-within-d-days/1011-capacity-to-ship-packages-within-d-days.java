class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }
        int minWeight = high;
        int totalWeight = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canShip(mid, weights, days)) {
                minWeight = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return minWeight;
    }

    private boolean canShip(int capacity, int[] weights, int days) {
        int usedDays = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                usedDays++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }

        return usedDays <= days;
    }
}