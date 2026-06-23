class Solution {
    public int[][] kClosest(int[][] points, int k) {
        if(k == points.length) return points;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> distance(b) - distance(a));

        for(int[] num : points){
            pq.offer(num);

            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.toArray(new int[k][]);
    }

    private int distance(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }
}
