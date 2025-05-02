class Solution {
    public int longestBeautifulSubstring(String word) {
    int maxLen = 0;
    int currLen = 0;
    int vowelCount = 0;
    char prev = 'a'; 
    for(int i=0;i<word.length();i++){
        char c=word.charAt(i);
        if(i>0 && c<word.charAt(i-1)){
            currLen=0;
            vowelCount=0;
        }
        if(i==0 || c!=word.charAt(i-1)){
            vowelCount++;
        }
        currLen++;
        if(vowelCount==5){
            maxLen=Math.max(maxLen, currLen);
        }
    }
    return maxLen;
    }
}