class Solution {
    public char findTheDifference(String s, String t) {
        int charCount = 0; 
        for (char c : s.toCharArray()) {
            charCount -= c; 
        }
        for (char c : t.toCharArray()) {
            charCount += c; 
        }
        return (char)charCount; 
        
        
        
        
        // int[] freq=new int[26];
        // for(char ch1:s.toCharArray()){
        //     freq[ch1-'a']++;
        // }
        // for(char ch2:t.toCharArray()){
        //     freq[ch2-'a']--;
        // }
        // for(char c='a';c<='z';c++){
        //     if(freq[c-'a']==-1){
        //         return c; 
        //     }
        // }
        //     return '\0';
            
    }
}