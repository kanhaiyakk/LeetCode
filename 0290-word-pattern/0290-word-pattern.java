class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!= words.length) return false;
        Map<Character,String> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            char ch= pattern.charAt(i);
            String word= words[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
            }
            else{
                if(map.containsValue(ch)){
                    return false;
                }else{
                    map.put(ch,word);
                }
            }
        }
            return true;
    }
}