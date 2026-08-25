class Solution {
    public int maxVowels(String s, int k) {
        int l=0,r=0,max=0;
        String vowels="aeiou";
        int count=0;
        while(r<s.length()){
            char ch=s.charAt(r);
               if (vowels.indexOf(ch) != -1){
                    count++;
                }
            if(r-l+1==k){
             
                max=Math.max(max,count);
                if (vowels.indexOf(s.charAt(l)) != -1){
                    count--;
                }
                l++;
            }
            r++;
        }
        return max;
    }
}