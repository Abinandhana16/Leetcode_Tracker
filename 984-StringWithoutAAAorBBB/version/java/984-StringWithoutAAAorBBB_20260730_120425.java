// Last updated: 7/30/2026, 12:04:25 PM
1
2 class Solution {
3    public String strWithout3a3b(int a, int b) {
4
5        StringBuilder sb = new StringBuilder();
6
7        while (a > 0 || b > 0) {
8
9            int len = sb.length();
10
11            if (len >= 2 &&
12                sb.charAt(len - 1) == sb.charAt(len - 2)) {
13
14                if (sb.charAt(len - 1) == 'a') {
15                    sb.append('b');
16                    b--;
17                } else {
18                    sb.append('a');
19                    a--;
20                }
21
22            } else {
23
24                if (a >= b && a > 0) {
25                    sb.append('a');
26                    a--;
27                } else if (b > 0) {
28                    sb.append('b');
29                    b--;
30                } else {
31                    sb.append('a');
32                    a--;
33                }
34            }
35        }
36
37        return sb.toString();
38    }
39}
40    
41