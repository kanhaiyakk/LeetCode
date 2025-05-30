class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=nums[0];
        int maxSoFar=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(nums[i], currSum+nums[i]);
            maxSoFar=Math.max(maxSoFar, currSum);
        }
        return maxSoFar;
    }
}