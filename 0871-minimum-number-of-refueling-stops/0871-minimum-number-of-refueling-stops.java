class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int stops = 0, currentFuel = startFuel, currentPosition = 0, stationIndex = 0;


        while(currentPosition + currentFuel < target){
            while(stationIndex < stations.length && stations[stationIndex][0] <= currentPosition + currentFuel){
                maxHeap.offer(stations[stationIndex][1]);
                stationIndex++;
            };

            if(maxHeap.isEmpty()) return -1;

            currentFuel += maxHeap.poll();
            stops++;
        }
        return stops;
    }
}