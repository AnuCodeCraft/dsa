class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largestValue = candies[0];
        List<Boolean> result = new ArrayList<>();

        for(int i = 1; i<candies.length; i++){
            largestValue = largestValue > candies[i] ? largestValue : candies[i];
        }

        for(int i = 0; i<candies.length; i++){
            if(candies[i] + extraCandies >= largestValue){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }
}