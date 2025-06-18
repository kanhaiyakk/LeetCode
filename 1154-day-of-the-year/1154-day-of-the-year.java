class Solution {
    public int dayOfYear(String date) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        if(isLeapYear(year)){
            days[1]=29;
        }
        int totalDay=day;
        for(int i=0;i<month-1;i++){
            totalDay += days[i];
        }
        return totalDay;
    }
    public boolean isLeapYear(int year){
        return ((year%400==0) || (year%4==0 && year%100!=0));
    }
}