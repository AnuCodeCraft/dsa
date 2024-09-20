class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> scoreMap = new TreeMap<>();

        for (int[] item : items) {
            int id = item[0];
            int score = item[1];

            scoreMap.computeIfAbsent(id, k -> new PriorityQueue<>()).add(score);
            if (scoreMap.get(id).size() > 5)
                scoreMap.get(id).poll();

        }

        List<int[]> result = new ArrayList<>();
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : scoreMap.entrySet()) {
            int id = entry.getKey();
            PriorityQueue<Integer> topFiveScore = entry.getValue();

            int sum = 0;
            while (!topFiveScore.isEmpty()) {
                sum += topFiveScore.poll();
            }
            ;
            int average = sum / 5;
            result.add(new int[] { id, average });
        }

        return result.toArray(new int[result.size()][]);
    }
}