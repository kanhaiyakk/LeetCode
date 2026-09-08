class Solution {
    public int majorityElement(int[] nums) {
        //optimal
        int candidate=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(candidate==num){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    //    int n=nums.length;
    //    Map<Integer,Integer> map=new HashMap<>();
    //    for(int num:nums){
    //     map.put(num, map.getOrDefault(num,0)+1);
    //    } 
    //    for(Map.Entry<Integer,Integer> entry: map.entrySet()){
    //     if(entry.getValue()>(n/2)){
    //         return entry.getKey();
    //     }
    //    }
    //    return -1;
    }
}