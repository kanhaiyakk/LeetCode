class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0,r=0,sum=0,count=0;
        double avg=Double.NEGATIVE_INFINITY;
        while(r<arr.length){
            sum+=arr[r];
            if(r-l+1==k){
                avg=(double)sum/k;
                if(avg>=threshold){
                count++;
                }
            sum-=arr[l];
            l++;
            }
            r++;
        }
        return count;
    }
}