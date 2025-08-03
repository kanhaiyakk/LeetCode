class Solution {
    public boolean isValid(String s) {
        Stack<String> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(Character.toString(ch));
            }
            else if(ch==')' && !stack.isEmpty() && stack.peek().equals("(")){
                stack.pop();
            }else if(ch=='}' && !stack.isEmpty() && stack.peek().equals("{")){
                stack.pop();
            }else if(ch==']' && !stack.isEmpty() && stack.peek().equals("[")){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}