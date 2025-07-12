class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(String word:nums){
            long num=Long.parseLong(word);
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        long res=pq.poll();
        return String.valueOf(res);
    }
}