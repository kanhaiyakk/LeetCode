class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start=nums[0];
        List<String> result=new ArrayList<>();

        if (nums == null || nums.length == 0){
            return result;
         }

        for(int i=1;i<=nums.length;i++){
            if(i==nums.length || nums[i]!=nums[i-1]+1){
                if(start==nums[i-1]){
                    result.add(String.valueOf(start));
                }else{
                    result.add(start + "->" + nums[i - 1]);
                }
                if(i<nums.length){
                start = nums[i];
            }
            }
        }
        return result;
    }
}