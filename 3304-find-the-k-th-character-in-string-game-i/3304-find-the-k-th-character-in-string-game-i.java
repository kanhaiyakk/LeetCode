class Solution {
    public char kthCharacter(int k) {
    long len = 1;
    while (len < k) len <<= 1;

    int shifts = 0;
    while (k > 1) {
        if (k > len / 2) {
            k -= len / 2;
            shifts = (shifts + 1) % 26;
        }
        len /= 2;
    }
    return (char)('a' + shifts); 
    }
}