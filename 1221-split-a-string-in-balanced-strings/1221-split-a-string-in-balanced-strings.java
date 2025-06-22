class Solution {
    public int balancedStringSplit(String s) {
        int countL=0, countR=0;
        int count=0;
        for(char ch: s.toCharArray()){
            if(ch=='L'){
                countL++;
            }else{
                countR++;
            }
            if(countL == countR){
                count++;
            }
        }
        return count;
    }
}