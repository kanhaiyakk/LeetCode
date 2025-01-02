class Solution {
    public int maxPower(String s) {
        int maxFreq=0;
        int currFreq=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currFreq++;
            }else{
                maxFreq=Math.max(currFreq,maxFreq);
                currFreq=1;
            }
        }
        maxFreq=Math.max(maxFreq,currFreq);
        return maxFreq;
    }
}