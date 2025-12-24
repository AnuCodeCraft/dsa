class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;
        int boxCount = 0;
        int sum = 0;

        for (int n : apple) {
            totalApples += n;
        };

        Arrays.sort(capacity);

        for(int i = capacity.length -1; i >= 0; i--) {
            sum += capacity[i];
            boxCount++;
            
            if (sum >= totalApples) {
                return boxCount;
            }
        }

        return boxCount;

    }
}
