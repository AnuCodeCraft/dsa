class Solution {
    public int[][] merge(int[][] intervals) {
        //1. sort the array
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, ((a,b) -> a[0] - b[0]));
        int[] newInterval = intervals[0]; 

        //2. compare frist and last element of array
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }else{
                result.add(newInterval);
                newInterval = intervals[i];
            }
        }
         
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
} 
