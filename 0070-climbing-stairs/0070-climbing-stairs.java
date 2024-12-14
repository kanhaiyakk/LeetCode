class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return n;
        }
        int a=1;
        int b=1;
        
        for(int i=2; i<=n;i++){
            int next=a+b;
            a=b;
            b=next;
        }
        return b;
    }
}