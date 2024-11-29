class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLength=0;
        Map<Character, Integer> charMap=new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            char ch=s.charAt(right);

            if(charMap.containsKey(ch) && charMap.get(ch)>=left){
                left=charMap.get(ch)+1;
            }
                charMap.put(ch,right);
                maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}