class Solution {
    public int removeElement(int[] nums, int val) {
     int left=0;
     for(int num:nums){
        if(num != val){
            nums[left]=num;
            left++;
        }
     }   
     return left;
    }
}