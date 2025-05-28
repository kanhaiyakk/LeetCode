class Solution {
    public int differenceOfSums(int n, int m) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                list1.add(i);
            }else{
                list2.add(i);
            }
        }
        int sum1=0;
        int sum2=0;
        for(int num:list1){
            sum1+=num;
        }
        for(int num:list2){
            sum2+=num;
        }
        return sum1-sum2;
    }
}