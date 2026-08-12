class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return covertInSeconds(endTime.split(":")) - covertInSeconds(startTime.split(":"));
    }

    public int covertInSeconds(String[] strs) {
        int value = 0;
        value += Integer.parseInt(strs[0]) * 3600;
        value += Integer.parseInt(strs[1]) * 60;
        value += Integer.parseInt(strs[2]);

        return value;
    }
}