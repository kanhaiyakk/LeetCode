class Solution {
    public int countPrimes(int n) {
        int count=0;
        for(int i=0;i<n;i++){
            if(isPrime(i)){
                count++;
            }
           
        }
        return count;
    }
    public boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2) return true;
        if(num%2==0) return false;
        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}