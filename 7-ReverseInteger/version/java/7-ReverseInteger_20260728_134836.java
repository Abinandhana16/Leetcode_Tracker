// Last updated: 7/28/2026, 1:48:36 PM
1class Solution {
2    public int reverse(int x) {
3        
4        long rev =0;
5        while(x!=0){
6            int digit  = x%10;
7            rev = rev*10+digit;
8            x=x/10;
9            if(rev<Integer.MIN_VALUE ||Integer.MAX_VALUE<rev ){
10                return 0;
11            }
12        }
13        return(int)rev;
14    }
15}