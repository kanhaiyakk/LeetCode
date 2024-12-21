class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] ss=new int [256];
        int[] tt=new int [256];
        int len=s.length();
        for(int i=0;i<len;i++){
            if(ss[s.charAt(i)] != tt[t.charAt(i)]){
                return false;
            }
            ss[s.charAt(i)]=i+1;
            tt[t.charAt(i)]=i+1;
        }
        return true;
    }
}