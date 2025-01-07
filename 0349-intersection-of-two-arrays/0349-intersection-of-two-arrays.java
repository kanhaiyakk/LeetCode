class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set=new HashSet<>();
        int p1=0;
        int p2=0;
        int n=nums1.length;
        int m=nums2.length;
        while(p1<n && p2<m){
        if(nums1[p1]==nums2[p2]){
            set.add(nums1[p1]);
            p1++;
            p2++;
        }else if(nums1[p1]<nums2[p2]){
            p1++;
            
        }else{
            p2++;
        }
        }
        int k=set.size();
        int i=0;
        int[] arr=new int[k];
        for(int num: set){
arr[i++]=num;
        }
        return arr;
    }
}