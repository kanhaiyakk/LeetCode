class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for (int num : nums) {
            total += num;
        }
        int lSum=0,rSum=0;
        for(int i=0;i<nums.length;i++){
            rSum=total-lSum-nums[i];
            if(lSum==rSum){
                return i;
            }
            lSum += nums[i];
        }
        return -1;
    }
}