class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        // sort the array
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int removed = 0;
        int lastEnd = Integer.MIN_VALUE;

        for(int[] interval : intervals){
            if(lastEnd <= interval[0]){
                lastEnd = interval[1];
            }else{
                removed++;
            }
        }

        return removed;
    }
}