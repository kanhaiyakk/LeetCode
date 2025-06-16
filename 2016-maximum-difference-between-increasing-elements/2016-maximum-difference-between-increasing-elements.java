class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff=-1;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[j]){
            maxDiff=Math.max(maxDiff,nums[i]-nums[j]);
            }else{
                nums[j]=nums[i];
            }
        }
        return maxDiff;
    }
}