// Last updated: 8/31/2026, 12:23:47 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int count = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            int sum = 0;
7
8            for (int j = i; j < nums.length; j++) {
9                sum += nums[j];
10
11                if (sum == k) {
12                    count++;
13                }
14            }
15        }
16
17        return count;
18    }
19}