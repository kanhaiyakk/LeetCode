class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String skk="";
        char[] ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            skk += ch[i];
        }
        if(str.equals(skk)){
            return true;
        }else{
            return false;
        }
    }
}