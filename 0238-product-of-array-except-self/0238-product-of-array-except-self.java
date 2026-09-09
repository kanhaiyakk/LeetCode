class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        //left product
        int lProd=1;
        for(int i=0;i<n;i++){
            ans[i]=lProd;
            lProd= lProd* nums[i];
        }
        //right prod
        int rProd=1;
        for(int i=n-1;i>=0;i--){
            ans[i]= ans[i]*rProd;
            rProd= rProd*nums[i];
        }
        return ans;
    }
}