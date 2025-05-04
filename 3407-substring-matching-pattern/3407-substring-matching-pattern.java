class Solution {
    public boolean hasMatch(String s, String p) {
        String[] word=p.split("\\*",-1);
        if(word.length!=2) return false;
        String prefix=word[0];
        String suffix=word[1];
        int preIndex=s.indexOf(prefix);
        if(preIndex==-1) return false;
        if (suffix.isEmpty()) {
            return true;
        }
        int suffixIndex=s.indexOf(suffix, preIndex+prefix.length());
        return suffixIndex!=-1;
    }
}