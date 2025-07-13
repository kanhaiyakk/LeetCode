class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length, m=nums2.length;
        int i=0,j=0;
        int[] res=new int[n+m];
        int k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                res[k++]=nums1[i++];
            }else{
                res[k++]=nums2[j++];
            }
        }
        while(i<n){
            res[k++]=nums1[i++];
        }
        while(j<m){
            res[k++]=nums2[j++];
        }
        if(res.length%2 != 0){
            return res[res.length/2];
        }else{
            int mid=res.length/2;
            return (res[mid-1]+res[mid])/2.0;
        }
    }
}