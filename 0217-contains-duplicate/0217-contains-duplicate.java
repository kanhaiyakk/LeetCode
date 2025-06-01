class Solution {
    public boolean containsDuplicate(int[] nums) {
    int left=nums[0];
    for(int i=1;i<nums.length;i++){
    if(left==nums[i]){
        return true;
    }
}
    return false;
    }
}