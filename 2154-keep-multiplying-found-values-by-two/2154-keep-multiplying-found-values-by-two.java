class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> numSet=new HashSet<>();
        for(int val : nums){
            numSet.add(val);
        }
        while(numSet.contains(original)){
            original=original*2;
        }
        return original;
        
        
//         while(true){
//             boolean found=false;
            
//             for (int num : nums) {
//                 if (num == original) {
//                     found = true;
//                     break;
//                 }
//             }
            
        
//         if(found){
//             original=original*2;
//             break;
//         }
//         else{
//             break;
//         }
//         }
//         return original;
    }
}