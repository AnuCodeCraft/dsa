class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0)
            return 0;

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        
        int arrowPos = points[0][1];
        int arrowCount = 1;

        for (int i = 1; i < points.length; i++) {
            if (arrowPos >= points[i][0]) {
                continue;
            } else {
                arrowCount++;
                arrowPos = points[i][1];
            }
        };

        return arrowCount;
    }
}