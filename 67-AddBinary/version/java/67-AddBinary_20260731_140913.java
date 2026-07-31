// Last updated: 7/31/2026, 2:09:13 PM
1class Solution {
2    public boolean threeConsecutiveOdds(int[] a) {
3        int count =0;
4        for(int i=0;i<a.length;i++){
5            if(a[i]%2!=0){
6                count++;
7            }
8            else{
9                count =0;
10            }
11             if(count==3){
12            return true;
13        }
14        }
15       
16        return false;
17        
18    }
19}