class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = piles[0];
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int minSpeed = high;

        while (low < high) {
            int mid = low + (high - low) / 2;
            // if it can eat with above speed find min Speed in left as right;
            if (canEatInTime(mid, piles, h)) {
                minSpeed = mid;
                // check left side of array to find the lower value then mid
                high = mid;
            } else {
                // check right side of array as with current value we are able to eating all bananas within time;
                low = mid + 1;
            }
        }
        return minSpeed;
    }

    private boolean canEatInTime(int mid, int[] piles, int h) {
        int count = 0;
        for (int pile : piles) {
            count += pile / mid;
            if (pile % mid != 0)
                count++;
        }
        return count <= h;
    }
}
