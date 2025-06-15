class Solution {
    public boolean areNumbersAscending(String s) {
      int prev=0;
      for(String word:s.split(" ")){
        if(isNumber(word)){
            int num=Integer.parseInt(word);
            if(num<=prev) return false;
            prev=num;
        }
      }
        return true;
    }
    public boolean isNumber(String s){
        for(char ch:s.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
}