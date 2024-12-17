class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        Map<Integer,Integer>map=new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }
        int result=0;
        for(int key: map.keySet()){
            if(map.get(key)==2){
                result=result^key;
            }
        }
        return result;
        // int result=0;
        // for(int num : nums){
        //     result = result^num;
        // }
        // return result;
    }
}