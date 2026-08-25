class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0,right=0,sum=0;
        double maxAvg = Double.NEGATIVE_INFINITY;
        while(right<nums.length){
            sum+=nums[right];
            if(right-left+1==k){
                maxAvg=Math.max(maxAvg,(double)sum/k);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return maxAvg;

    }
}