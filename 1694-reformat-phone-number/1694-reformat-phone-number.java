class Solution {
    public String reformatNumber(String number) {
        String str=number.replaceAll("[^0-9]", "");
        StringBuilder sb=new StringBuilder();
        int n=str.length();
        int i=0;
        while(n-i >4){
            sb.append(str.substring(i,i+3)).append("-");
            i+=3;
        }
        int remaining=n-i;
        if(remaining==4){
            sb.append(str.substring(i,i+2)).append("-").append(str.substring(i+2));
        }else{
            sb.append(str.substring(i));
        }
        return sb.toString();
    }
}