class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(seen.containsKey(nums[i]) && (i-seen.get(nums[i]))<=k){
                return true;
            }
            seen.put(nums[i],i);
        }
        return false;
        
        
    //     int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(nums[i]==nums[j] && Math.abs(i-j)<=k){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
     }
}