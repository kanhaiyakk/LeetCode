class Solution {
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do{
            slow=squareSum(slow);
            fast=squareSum(squareSum(fast));
        }while(slow!=fast);
            if(slow==1) return true;
            else return false;
    }
    public static int squareSum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum +=digit*digit;
            n/=10;
        }
        return sum;
    }
}