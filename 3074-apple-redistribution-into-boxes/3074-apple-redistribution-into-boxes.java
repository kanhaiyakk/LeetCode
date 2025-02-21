class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleSum=0;
        int count=0;
        for(int num: apple){
            appleSum+=num;
        }
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            appleSum-=capacity[i];
            count++;
            if(appleSum<=0){
                return count;
            }

        }
        return count;
    }
}