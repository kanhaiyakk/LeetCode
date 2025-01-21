class Solution {
    public int singleNumber(int[] nums) {
//Bit Manipulation
           int  res=0;
           for(int num: nums){
            res^=num;
           }
           return res;



        // Map<Integer,Integer> map=new HashMap<>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // for(int key: nums){
        //     if(map.get(key)==1){
        //         return key;
        //     }
        // }
        // return -1;
    }
}