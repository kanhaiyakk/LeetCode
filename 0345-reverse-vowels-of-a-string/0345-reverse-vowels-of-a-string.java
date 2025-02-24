class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        char[] ch=s.toCharArray();
        Set<Character> set=new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
int left=0,right=n-1;
while(left<right){
    while(left<right && !set.contains(ch[left])){
        left++;
    }
    while(left<right && !set.contains(ch[right])){
        right--;
    }
    if(left<right){
        char temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        left++;
        right--;
    }
}
return new String(ch);
    }
}