class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usedInteger = new HashSet<>();
        
        while (n != 1 && !usedInteger.contains(n)) {
            usedInteger.add(n);
            n = getNext(n);
        }
        
        return n == 1;
    }
    
    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
}