class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0,sumB=0;
        for(int a:aliceSizes) sumA+=a;
        for(int b:bobSizes) sumB+=b;

        int delta=(sumA-sumB)/2;

        Set<Integer> set=new HashSet<>();
        for(int a:aliceSizes) set.add(a);

        for(int b:bobSizes){
            int a=b+delta;
            if(set.contains(a)){
                return new int[]{a,b};
            }
        }
        return new int[0];
    }
}