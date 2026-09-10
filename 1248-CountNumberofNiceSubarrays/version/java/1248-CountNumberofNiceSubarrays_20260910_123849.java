// Last updated: 9/10/2026, 12:38:49 PM
1class Solution {
2        public int numberOfSubarrays(int[] A, int k) {
3        int res = 0, i = 0, count = 0, n = A.length;
4        for (int j = 0; j < n; j++) {
5            if (A[j] % 2 == 1) {
6                --k;
7                count = 0;
8            }
9            while (k == 0) {
10                k += A[i++] & 1;
11                ++count;
12            }
13            res += count;
14        }
15        return res;
16    }
17}