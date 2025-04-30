class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String combined=s1+" "+ s2;
        String[] words=combined.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        List<String> list=new ArrayList<>();
        for(String word: map.keySet()){
            if(map.get(word)==1){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}