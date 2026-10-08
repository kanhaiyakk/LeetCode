class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        for(int num: prices){
            min=Math.min(min,num);
            int currProfit=num-min;
            maxProfit=Math.max(maxProfit, currProfit);
        }
        return maxProfit;
    }
}