class Solution {
    public int singleNumber(int[] nums) {
        
        //using set
        Set<Integer> set=new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        return set.iterator().next();
        
       
//         for(int i=0;i<nums.length;i++){
//             int count=0;
//             for(int j=0;j<nums.length;j++){
//             if(nums[i]==nums[j]){ 
//                 count++;
//             }
//             }
//             if(count==1){
//                 return nums[i];
//             }
            
//         }
        
//         return -1;
    }
}