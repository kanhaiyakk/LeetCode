class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==entry.getKey()){
                list.add(entry.getKey());
            }
        }
        int maxLucky=0;
        for(int num:list){
            if(num>maxLucky){
                maxLucky=num;
            }
        }
        if(maxLucky!=0){
            return maxLucky;
        }else{
            return -1;
        }
    }
}