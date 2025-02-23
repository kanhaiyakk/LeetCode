class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence==null) return false;
        Set<Character> set=new HashSet<>();
        //sentence=sentence.toLowerCase();
        for(char ch:sentence.toCharArray()){
            if(ch>='a' && ch<='z'){
                set.add(ch);

            }
        }
        if(set.size()==26){
            return true;
        }
        return false;
    }
}