class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> seen=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(seen.contains(ch)){
                return ch;
            }
            seen.add(ch);
        }
        throw new IllegalArgumentException("Input string does not meet the problem constraints.");
    
    }
}