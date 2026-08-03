// Last updated: 8/3/2026, 3:50:32 PM
1class Solution {
2    public int climbStairs(int n) {
3        if(n==0 || n==1){
4            return 1;
5        }
6         int[] dp = new int[n+1];
7        dp[0] = dp[1] = 1;
8        
9        for (int i = 2; i <= n; i++) {
10            dp[i] = dp[i-1] + dp[i-2];
11        }
12        return dp[n];
13    }
14}