class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int evenCount=0;
        int oddCount=0;
        for(int num:map.values()){
            if(num%2==0){
                evenCount+=num;
            }else{
                oddCount+=num;
            }
        }
        if(oddCount<1){
            return evenCount;
        }else{
            return evenCount+1;
        }
    }
}