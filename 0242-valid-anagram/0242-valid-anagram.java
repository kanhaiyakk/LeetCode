class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch=s.toCharArray();
        char[] c=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(c);
        if(s.length()!=t.length()){
            return false;
        }
        return Arrays.equals(ch,c); 
    }
}