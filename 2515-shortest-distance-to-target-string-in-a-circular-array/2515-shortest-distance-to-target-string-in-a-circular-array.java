class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int minDist=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int len=Math.min(Math.abs(i-startIndex), n-Math.abs(i-startIndex));
                minDist=Math.min(minDist,len);
            }
        }
        return minDist==Integer.MAX_VALUE ? -1:minDist;
    }
}