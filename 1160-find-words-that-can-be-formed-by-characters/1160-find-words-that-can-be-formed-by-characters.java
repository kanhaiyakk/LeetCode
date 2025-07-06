class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch: chars.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int totalLength=0;
        for(String str:words){
            Map<Character,Integer> freq=new HashMap<>();
            boolean canForm=true;
            for(char ch: str.toCharArray()){
                freq.put(ch, freq.getOrDefault(ch,0)+1);
                if(freq.get(ch)> map.getOrDefault(ch,0)){
                    canForm=false;
                    break;
                }
            }
            if(canForm){
                totalLength += str.length();
            }
        }
        return totalLength;
    }
}