class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Integer> result=new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key)==1){
                result.add(key);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}