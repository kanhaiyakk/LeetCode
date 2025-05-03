class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int first=-1,last=-1;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
                 if(first==-1){
                    first=i;
                 }
                last=i;
            }
        }
            if(first!=-1 && last!=-1){
                return last-first;
            }
            return 0;
    }
    public boolean isPrime(int number){
        if(number<=1) return false;
        if(number==2) return true;
        if(number%2==0) return false;

        for(int i=3;i<=Math.sqrt(number);i+=2){
            if(number%i==0) return false;
        }
        return true;
    }
}