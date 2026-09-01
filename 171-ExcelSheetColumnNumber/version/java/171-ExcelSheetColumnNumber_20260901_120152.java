// Last updated: 9/1/2026, 12:01:52 PM
1class Solution {
2    public int titleToNumber(String col) {
3        int result =0;
4        for(int i=0;i<col.length();i++){
5            result = result*26+(col.charAt(i)-'A'+1);
6        }
7        return result;
8    }
9}