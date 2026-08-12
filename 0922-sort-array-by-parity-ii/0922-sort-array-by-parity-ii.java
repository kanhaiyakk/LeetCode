class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int n=nums.length;
       int[] ans=new int[n];
       int i=0;
       for(int num: nums){
        if(num%2==0){
            ans[i]=num;
            i+=2;
        }
       }
        int j=1;
        for(int num: nums){
            if(num%2 == 1){
                ans[j]=num;
                j+=2;
            }
        }
        return ans;
    } 
}