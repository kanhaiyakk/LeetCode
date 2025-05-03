class Solution {
    public int splitNum(int num) {
       char[] ch=String.valueOf(num).toCharArray();
       StringBuffer num1=new StringBuffer();
       StringBuffer num2=new StringBuffer();
       Arrays.sort(ch);
       for(int i=0;i<ch.length;i++){
        if(i%2==0){
            num1.append(ch[i]);
        }else{
            num2.append(ch[i]);
        }
       }
       return Integer.parseInt(num1.toString())+ Integer.parseInt(num2.toString());
    }
}