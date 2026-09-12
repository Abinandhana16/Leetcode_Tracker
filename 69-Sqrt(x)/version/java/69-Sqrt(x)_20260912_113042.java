// Last updated: 9/12/2026, 11:30:42 AM
1class Solution {
2    public int mySqrt(int x) {
3        if(x==0||x==1){
4            return x;
5        }
6        int ans = 0;
7        for(int i=0;i<x;i++){
8            if((long)i*i <= x){
9                ans=i;
10            }
11            else{
12                break;
13            }
14        }
15        return ans;
16    }
17}