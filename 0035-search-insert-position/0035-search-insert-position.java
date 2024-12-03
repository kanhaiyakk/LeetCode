class Solution {
    public int searchInsert(int[] nums, int target) {
     
        int low=0;
        int high=nums.length-1;
        while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid] == target){
            return mid;
        }    
         else if(nums[mid]< target){
             low=mid+1;
         }   
            else{
                high=mid-1;
            }
        }
        return low;
        
        
        // int index=Arrays.binarySearch(nums, target);
        // if(index>=0){
        //     return index;
        // }
        // else{
        //     return -(index+1);
        // }
    }
}