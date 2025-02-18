class Solution {
    public int findClosestNumber(int[] nums) {
        //int dist=0;
        int smallest=Integer.MAX_VALUE;
        for(int num: nums){
            if(Math.abs(num)<Math.abs(smallest) || (Math.abs(num)==Math.abs(smallest)) && num>smallest ){
                smallest=num;
            }
        }
        return smallest;
    }
}