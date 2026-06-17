class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x1, x2) -> x2.compareTo(x1));

        for (int[] nums : matrix) {
            for (int ele : nums) {
                pq.add(ele);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }

        return pq.peek();
    }
}