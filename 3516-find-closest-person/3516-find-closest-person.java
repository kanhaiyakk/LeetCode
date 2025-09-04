class Solution {
    public int findClosest(int x, int y, int z) {
        int x_close = Math.abs(x - z);
        int y_close = Math.abs(y - z);

        if (x_close < y_close) {
            return 1;
        } else if (y_close < x_close) {
            return 2;
        } else {
            return 0;
        }
        
    }
}