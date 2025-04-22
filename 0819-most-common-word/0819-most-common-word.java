class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet=new HashSet<>();
        for(String s:banned){
            bannedSet.add(s.toLowerCase());
        }
        Map<String, Integer> map=new HashMap<>();
        String result="";
        String[] words=paragraph.toLowerCase().replaceAll("[^a-z]"," ").split("\\s+");
        int max=0;
        for(String word:words){
            if(!bannedSet.contains(word)){
                map.put(word,map.getOrDefault(word, 0)+1);
                if(map.get(word)>max){
                max=map.get(word);
                result=word;
                }
            }
        }
        return result;

    }
}