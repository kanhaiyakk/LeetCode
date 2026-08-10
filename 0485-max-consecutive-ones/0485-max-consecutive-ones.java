class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tempMax=0;
        int maximum=0;
        for(int num:nums){
            if(num==1){
                tempMax++;
                maximum=Math.max(maximum, tempMax);
            }else{
                tempMax=0;
            }
        }
        return maximum;
    }
}