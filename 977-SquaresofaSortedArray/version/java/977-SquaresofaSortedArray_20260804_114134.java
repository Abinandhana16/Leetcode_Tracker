// Last updated: 8/4/2026, 11:41:34 AM
1class Solution {
2    public int[] sortedSquares(int[] a) {
3        for(int i=0;i<a.length;i++){
4            a[i] = a[i]*a[i];
5        }
6        Arrays.sort(a);
7        return a;
8    }
9}