// Last updated: 7/28/2026, 2:00:11 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        long rev =0;
4        int copy = x;
5        if(x<0){
6            return false;
7        }
8        while(x>0){
9            int digit = x%10;
10            rev = rev*10+digit;
11            x=x/10;
12        }
13        return rev == copy;
14        
15    }
16}