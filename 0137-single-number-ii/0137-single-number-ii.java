class Solution {
    public int singleNumber(int[] nums) {
        //using map
        Map<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
             map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key: map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
        
        
       // for(int i=0;i<nums.length;i++){
       //     int count=0;
       //     for(int j=0;j<nums.length;j++){
       //         if(nums[i]==nums[j]){
       //             count++;
       //         }
       //     }
       //     if(count==1){
       //         return nums[i];
       //     }
       // }
       // return -1;
    }
}