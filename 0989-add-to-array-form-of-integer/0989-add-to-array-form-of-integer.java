class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
List<Integer> ans = new ArrayList<>();
        int n = num.length;
        int carry = 0;
        int i = n - 1;

        while (i >= 0 || k > 0 || carry > 0) {
            int digitNum = (i >= 0) ? num[i] : 0;
            int digitK = k % 10;
            int sum = digitNum + digitK + carry;

            ans.add(sum % 10);
            carry = sum / 10;
            k /= 10;
            i--;
        }

        Collections.reverse(ans);
        return ans;
    }
}