class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                               ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                               "...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> morseCodeSet=new HashSet<>();
        for(String word:words){
            StringBuilder sb=new StringBuilder();
            for(char ch:word.toCharArray()){
                sb.append(morseCodes[ch-'a']);
            }
            morseCodeSet.add(sb.toString());
        }
        return morseCodeSet.size();
    }
}