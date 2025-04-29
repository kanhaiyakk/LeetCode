class Solution {
    public double myPow(double x, int n) {
       long N = n;  // convert to long once
        return power(x, N);
    }

    private double power(double x, long n) {
        if (n == 0) return 1.0;
        if (n < 0) {
            return power(1 / x, -n);
        }

        double half = power(x, n / 2);

        return (n % 2 == 0) ? half * half : half * half * x;
    }
}