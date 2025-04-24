class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0 || duration == 0) return 0;
        int total=0;
        for(int i=0;i<timeSeries.length-1;i++){
            int diff=timeSeries[i+1]-timeSeries[i];
            total += Math.min(duration,diff);
        }
        total+=duration;
        return total;
    }
}