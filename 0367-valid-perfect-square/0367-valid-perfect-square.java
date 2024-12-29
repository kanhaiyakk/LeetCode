class Solution {
    public boolean isPerfectSquare(int num) {
        //method 2 Binary search
        // int start=1;
        // int end=num;
        // while(start<=num){
        //     long mid=start+ (end-start)/2 ;
        //     if(mid*mid==num) return true;
        //     if(mid*mid>num){
        //         end=(int)mid-1;
        //     }else{
        //         start=(int)mid+1;
        //     }
        // }
        //      return false;
        


        //method 1
        return Math.pow(num,0.5)%1==0;
    }
}