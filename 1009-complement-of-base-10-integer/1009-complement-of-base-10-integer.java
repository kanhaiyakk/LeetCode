class Solution {
    public int bitwiseComplement(int n) {
        int bitLength=Integer.toBinaryString(n).length();
        int mask=(1 << bitLength)-1;
        return mask^n;
    }
}