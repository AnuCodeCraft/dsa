class Solution {
    public int minimumChairs(String s) {
        int[] arr = new int[s.length()];
        int count = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                count++;
                arr[i] = count;
            } else {
                count--;
                arr[i] = count;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;

    }
}