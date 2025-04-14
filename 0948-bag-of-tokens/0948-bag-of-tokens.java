class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left=0,right=tokens.length-1;
        int score=0,MaxScore=0;
        while(left<=right){
            if(power>= tokens[left]){
                power -=tokens[left++];
                score++;
                MaxScore=Math.max(MaxScore,score);
            }else if(score>0){
                power+=tokens[right--];
                score--;
            }else{
                break;
            }
        }
        return MaxScore;
    }
}