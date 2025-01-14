class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        if(nums.length==1) return list;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=1;i<=nums.length;i++){
           if(map.getOrDefault(i,0)>1){
            list.add(i);
           }
        }
        return list;
    }
}