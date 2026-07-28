// Last updated: 7/28/2026, 2:55:15 PM
1class Solution {
2    public int romanToInt(String s) {
3        int num=0,ans=0;
4        for(int i=s.length()-1;i>=0;i--){
5            switch(s.charAt(i)){
6            case 'I':num = 1;break;
7            case 'V':num = 5;break;
8            case 'X':num = 10;break;
9            case 'L':num = 50;break;
10            case 'C':num = 100;break;
11            case 'D':num = 500;break;
12            case 'M':num = 1000;break;
13            }
14            if(4*num < ans) ans-=num;
15            else ans+=num;
16        
17        }
18        return ans;
19    }
20}