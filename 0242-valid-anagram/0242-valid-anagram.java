class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Set<Character> seen=new HashSet<>();
        for(char ch: s.toCharArray()){
            seen.add(ch);
        }
        for(char ch1:t.toCharArray()){
            if(!seen.contains(ch1)){
                return false;
            }
        }
        return true;
    }
}