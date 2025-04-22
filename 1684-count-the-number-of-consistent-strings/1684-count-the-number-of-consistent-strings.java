class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        Set<Character> set=new HashSet<>();
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        for(String word : words){
            boolean isConsistant=true;
            for(char ch1:word.toCharArray()){
                if(!set.contains(ch1)){
                    isConsistant=false;
                    break;
                }
            }
            if(isConsistant) count++;
        }
        return count;
    }
}