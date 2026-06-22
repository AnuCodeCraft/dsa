class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> result = new ArrayList<>();
        int[] newintervals = intervals[0];
        

        for (int i = 1; i < intervals.length; i++) {
            if (newintervals[1] >= intervals[i][0]) {
                newintervals[1] = Math.max(newintervals[1], intervals[i][1]);
            }else{
                result.add(newintervals);
                newintervals = intervals[i];
            }
        }

        result.add(newintervals);
        return result.toArray(new int[result.size()][]);

    }
}

