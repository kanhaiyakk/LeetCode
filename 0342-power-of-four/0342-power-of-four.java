class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        if(n>1){
            return n%4==0 && isPowerOfFour(n/4);
        }else{
            return false;
        }



    //  if(n<=0) return false;
    //  while(n%4==0){
    //     n/=4;
    //  }   
    //  return n==1;
    }
}