class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean hasVowel=false,hasConsonant=false;
        String vowels="aeiouAEIOU";
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(vowels.indexOf(ch)!=-1){
                hasVowel=true;
            }
            else if(Character.isLetter(ch)){
                hasConsonant=true;
            }
        }
        return hasVowel && hasConsonant;
    }
}