class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,rem;
        int num=x;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev==x;
    }
}