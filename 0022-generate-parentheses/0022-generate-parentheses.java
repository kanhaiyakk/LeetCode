class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        backtracking(result,"",0,0,n);
        return result;
    }
    public void backtracking(List<String> result,String curr,int open,int close,int max){
        if(curr.length()==max*2){ //base case
            result.add(curr);
            return;
        }
        if(open<max){
            backtracking(result,curr+"(" , open+1,close,max);
        }
        if(close<open){ //open will come first
            backtracking(result,curr+")", open,close+1,max);
        }
    }
}