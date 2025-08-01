class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> row,preRow=null;
        for(int i=0; i<numRows; i++){
            row=new ArrayList<>();
            for(int j=0; j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(preRow.get(j-1)+preRow.get(j));
                }
            }
            preRow=row;
            result.add(row);
        }
        return result;  
    }
}