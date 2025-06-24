class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] arr=new int[k];
        int i=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=k){
                arr[i++]=entry.getKey();
            }
        }
        return arr;
    }
}