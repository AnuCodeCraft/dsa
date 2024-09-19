class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] directions = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int x = 0, y = 0, dx = 0, count = 0;

        while (count < 4) {

            for (int i = 0; i < instructions.length(); i++) {
                if (instructions.charAt(i) == 'G') {
                    x = x + directions[dx][0];
                    y = y + directions[dx][1];
                } else if (instructions.charAt(i) == 'R') {
                    dx = (dx + 1) % 4;
                } else {
                    dx = (dx + 3) % 4;
                }
            }
            count++;
        }
        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
}