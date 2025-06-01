class Solution {
    public int minimumChairs(String s) {
        int maxWaiting=0;
        int waitingCount=0;
        for(char ch: s.toCharArray()){
            if(ch =='E'){
                waitingCount++;
                maxWaiting=Math.max(maxWaiting,waitingCount);
            }else{
                waitingCount--;
            }
        }
        return maxWaiting;
    }
}