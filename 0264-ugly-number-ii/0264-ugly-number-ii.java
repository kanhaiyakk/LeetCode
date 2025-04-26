class Solution {
    public int nthUglyNumber(int n) {
        int[] res=new int[n];
        res[0]=1;
        int i2=0,i3=0,i5=0;
        for(int i=1;i<n;i++){
            int next2=res[i2]*2;
            int next3=res[i3]*3;
            int next5=res[i5]*5;

            int nextUgly=Math.min(next2,Math.min(next3,next5));
            res[i]=nextUgly;

            if(nextUgly==next2) i2++;
            if(nextUgly==next3) i3++;
            if(nextUgly==next5) i5++;
        }
        return res[n-1];
    }
}