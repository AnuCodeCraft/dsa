class Solution {
    public int[][] kClosest(int[][] points, int k) {
        if (k == points.length)
            return points;

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> distance(b) - distance(a));

        for (int[] point : points) {
            maxHeap.offer(point);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.toArray(new int[k][]);
    }

    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
