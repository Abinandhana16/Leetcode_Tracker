// Last updated: 7/28/2026, 1:45:04 PM
1class Solution {
2    public int reverse(int x) {
3        long rev = 0;
4        while(x !=0){
5            rev  = rev*10+(x%10);
6            x=x/10;
7            if(rev<Integer.MIN_VALUE || Integer.MAX_VALUE<rev){
8                return 0;
9            }      
10        }
11        return(int)rev;
12         
13    }
14}