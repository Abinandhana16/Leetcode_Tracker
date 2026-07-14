// Last updated: 7/14/2026, 2:12:58 PM
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        String[] row = new String[numRows];
        for (int i = 0; i < numRows; i++) row[i] = "";

        int r = 0, dir = 1;

        for (char c : s.toCharArray()) {
            row[r] += c;

            if (r == 0) dir = 1;
            if (r == numRows - 1) dir = -1;

            r += dir;
        }

        String ans = "";
        for (String x : row) ans += x;

        return ans;
    }
}
    
