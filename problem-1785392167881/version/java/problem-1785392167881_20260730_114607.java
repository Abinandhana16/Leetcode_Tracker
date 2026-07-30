// Last updated: 7/30/2026, 11:46:07 AM
1class Solution {
2    public boolean checkValidString(String s) {
3        int leftMin = 0,leftMax = 0;
4
5        for(char c : s.toCharArray()){
6            if(c=='('){
7                leftMin++;
8                leftMax++;
9            }
10             else if(c==')'){
11                leftMin--;
12                leftMax--;
13            }
14            else{
15                leftMin--;
16                leftMax++;
17            }
18            if(leftMax<0)return false;
19            if(leftMin<0) leftMin =0;
20        }
21        return leftMin == 0;
22    }
23}