class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); 
        Arrays.sort(nums2);
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>nums2[i]){
            int x=nums2[i]-nums1[i];
            set.add(x);
            }else{
            int x=nums2[i]-nums1[i];
            set.add(x);
            }
        }
        
        if(set.size()==1){
            for(int num:set){
                return num;
            }
        }
        return 0;
    }
}