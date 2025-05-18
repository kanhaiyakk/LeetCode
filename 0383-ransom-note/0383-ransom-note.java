class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:magazine.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch1:ransomNote.toCharArray()){
            if(!map.containsKey(ch1) || map.get(ch1)==0) return false;
           map.put(ch1, map.get(ch1)-1);
        }
        return true;
    }
}