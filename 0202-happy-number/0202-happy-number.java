class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = calculateSquareSum(n);
        }

        return n == 1;
    }
        private static int calculateSquareSum(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
        
        
    
}