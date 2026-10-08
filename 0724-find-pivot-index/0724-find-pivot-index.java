class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        int lSum=0;
        int rSum=0;
        for(int num:nums){
            totalSum+=num;
        }

        for(int i=0;i<nums.length;i++){
            rSum=totalSum-lSum-nums[i];
            if(lSum==rSum){
                return i;
            }
            lSum+=nums[i];
        }
        return -1;
    
    }
}