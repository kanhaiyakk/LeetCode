class Solution {
    public String[] findWords(String[] words) {
        String firstRow="qwertyuiop";
        String secondRow="asdfghjkl";
        String thirdRow="zxcvbnm";
        List<String> list=new ArrayList<>();
        for(String word:words){
            String lowerWord=word.toLowerCase();
            if(isInRow(lowerWord,firstRow) || isInRow(lowerWord,secondRow) || isInRow(lowerWord,thirdRow)){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
    private boolean isInRow(String word,String row){
        for(char ch: word.toCharArray()){
            if(row.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}