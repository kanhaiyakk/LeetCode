class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x >= y)
            return remove(s, 'a', 'b', x, y);
        else
            return remove(s, 'b', 'a', y, x);
    }
    private int remove(String s, char first, char second, int firstVal, int secondVal) {
        int total = 0;
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == first && c == second) {
                sb.deleteCharAt(sb.length() - 1);
                total += firstVal;
            } else {
                sb.append(c);
            }
        }
        StringBuilder finalSb = new StringBuilder();
        for (char c : sb.toString().toCharArray()) {
            if (finalSb.length() > 0 && finalSb.charAt(finalSb.length() - 1) == second && c == first) {
                finalSb.deleteCharAt(finalSb.length() - 1);
                total += secondVal;
            } else {
                finalSb.append(c);
            }
        }
        return total;
    }
}