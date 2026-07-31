// Last updated: 7/31/2026, 12:02:16 PM
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int i = a.length()-1;
5        int j = b.length()-1;
6
7        int carry =0;
8        while(i>=0 || j>=0||carry!=0){
9            int sum = carry;
10            if(i>=0){
11                sum+=a.charAt(i)-'0';
12                i--;
13            }
14            if(j>=0){
15                sum+=b.charAt(j)-'0';
16                j--;
17            }
18            sb.append(sum%2);
19            carry = sum/2;
20            
21        }
22        return sb.reverse().toString();
23
24    }
25}