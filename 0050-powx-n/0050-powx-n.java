class Solution {
    public double myPow(double x, int n) {
         // Handle the special case where n == Integer.MIN_VALUE
        if (n == Integer.MIN_VALUE) {
            // To avoid overflow, use (n + 1) and compute the result
            return myPow(x, Integer.MIN_VALUE + 1) * x;
        }
        
        if (n == 0) return 1; 
    if(n<0){
        x=1/x;
        n=-n;
    }
    double pow=1.0;
    while(n!=0){
        if(n%2 ==1){
            pow *=x;
        }
            x *=x;
            n/=2;       
    }
    return pow;
    }
}