class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        String rev="";
        rev=sb.reverse().toString();
        if(rev.equals(s)){
            return true;
        }
        return false;
    }
}