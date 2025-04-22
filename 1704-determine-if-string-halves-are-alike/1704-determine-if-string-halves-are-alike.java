class Solution {
    public boolean halvesAreAlike(String s) {
            int n=s.length();
            String a=s.substring(0,(n/2));
            String b=s.substring(n/2);

            int vowelA=0;
            int vowelB=0;
            for(char ch:a.toCharArray()){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                   vowelA++;
                }
            }
            for(char ch:b.toCharArray()){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                   vowelB++;
                }
            }
        return vowelA==vowelB;

    }
}