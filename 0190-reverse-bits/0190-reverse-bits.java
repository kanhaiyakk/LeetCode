public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        String reverse= new StringBuilder(s).reverse().toString();
        int result=(int)Long.parseLong(reverse,2);
        return result; 
    }
}