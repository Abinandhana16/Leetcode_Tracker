// Last updated: 7/24/2026, 1:44:23 PM
1class Solution {
2    public int strStr(String s, String t) {
3        int index = -1;
4        for(int i=0;i<=s.length()-t.length();i++){
5            boolean found = true;
6            for(int j=0;j<t.length();j++){
7                if(s.charAt(i+j) != t.charAt(j)){
8                    found = false;
9                    break;
10                }
11            }
12            if(found){
13                index = i;
14                break;
15
16            }
17        }
18        if(index!=-1){
19            return index;
20        }
21        else{
22            return -1;
23        }
24    }
25}