class Solution {
    public String maxValue(String n, int x) {
        int len=n.length();
        if(n.charAt(0)!= '-'){
            //positive number
            for(int i=0;i<len;i++){
                if(x > n.charAt(i)-'0'){
                    return n.substring(0,i)+x+n.substring(i);
                }
            }

        }else{
            //negative number
            for(int i=1;i<len;i++){
            if(x<n.charAt(i)-'0'){
                return n.substring(0,i)+x+n.substring(i);
            }
            }
        }

        return n+x;
    }
}