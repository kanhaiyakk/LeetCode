class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        if (n <= 1) return nums;
       int mid=n/2;
       int[] leftArr=new int[mid];
       int[] rightArr=new int[n-mid];
       for(int i=0;i<mid;i++){
        leftArr[i]=nums[i];
       }
       for(int i=mid;i<n;i++){
        rightArr[i-mid]= nums[i];
       }
       leftArr =sortArray(leftArr);
       rightArr= sortArray(rightArr);
      return merge(leftArr,rightArr);
    }
    private int[] merge(int[] leftArr, int[] rightArr){
        int left=leftArr.length;
        int right=rightArr.length;
        int[] merged = new int[left + right];

        int i = 0, j = 0, k = 0;

        // Compare and merge
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                merged[k++] = leftArr[i++];
            } else {
                merged[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements
        while (i < left) {
            merged[k++] = leftArr[i++];
        }

        while (j < right) {
            merged[k++] = rightArr[j++];
        }

        return merged;
    }
}