class Solution {
    public int maxProfit(int[] prices) {
        int minVal=prices[0];
        int maxProfit=0;
        for(int num:prices){
            minVal=Math.min(num,minVal);
            int profit=num-minVal;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}