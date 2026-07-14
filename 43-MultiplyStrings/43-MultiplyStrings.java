// Last updated: 7/14/2026, 2:12:26 PM
class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int p = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                res[i + j + 1] += p;
                res[i + j] += res[i + j + 1] / 10;
                res[i + j + 1] %= 10;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int x : res) {
            if (ans.length() == 0 && x == 0) continue;
            ans.append(x);
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }
}