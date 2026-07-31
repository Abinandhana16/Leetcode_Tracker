// Last updated: 7/31/2026, 2:30:37 PM
1class Solution {
2    public int subtractProductAndSum(int n) {
3        int sum=0;
4        int product =1;
5        while(n>0){
6            int digit = n%10;
7            sum+=digit;
8            product *=  digit;
9            n=n/10;
10        }
11        return (product - sum);
12    }
13}