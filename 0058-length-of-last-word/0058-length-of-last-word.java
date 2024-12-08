class Solution {
    public int lengthOfLastWord(String s) {
        int kk=0;
       String[] words=s.split(" ");
        int n=words.length;
        for(int i=0;i<n;i++){
            kk=words[n-1].length();
        }
        return kk;    
        
    }
}