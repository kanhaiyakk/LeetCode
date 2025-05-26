class Solution {
    public String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
            int low=i;
            int end=Math.min(i+k-1, s.length()-1);
            while(low<end){
                char temp=ch[low];
                ch[low]=ch[end];
                ch[end]=temp;
                low++;
                end--;
            }
        }
        return new String(ch);
    }
}