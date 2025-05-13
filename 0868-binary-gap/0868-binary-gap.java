class Solution {
    public int binaryGap(int n) {
        String str=Integer.toBinaryString(n);
        int maxGap=0;
        int lastIdx=-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                if(lastIdx!=-1){
                int gap=i-lastIdx;
                maxGap=Math.max(maxGap, gap);
            }
            lastIdx=i;
            }
        }
        return maxGap;
    }
}