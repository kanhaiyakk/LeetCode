class Solution {
    public int maxProfit(int[] prices) {
        int minVal=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int currValue : prices){
            if(currValue<minVal){
                minVal=currValue;
            }
            int currProfit=currValue-minVal;
            if(currProfit>maxProfit){
                maxProfit=currProfit;
            }
        }
        return maxProfit;
    }
}