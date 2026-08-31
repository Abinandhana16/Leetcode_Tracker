// Last updated: 8/31/2026, 12:32:44 PM
1import java.util.*;
2
3class Solution {
4    public List<String> subdomainVisits(String[] cpdomains) {
5        HashMap<String, Integer> map = new HashMap<>();
6
7        for (String s : cpdomains) {
8            String[] parts = s.split(" ");
9            int count = Integer.parseInt(parts[0]);
10            String domain = parts[1];
11
12            while (true) {
13                map.put(domain, map.getOrDefault(domain, 0) + count);
14
15                int dot = domain.indexOf('.');
16
17                if (dot == -1)
18                    break;
19
20                domain = domain.substring(dot + 1);
21            }
22        }
23
24        List<String> result = new ArrayList<>();
25
26        for (String domain : map.keySet()) {
27            result.add(map.get(domain) + " " + domain);
28        }
29
30        return result;
31    }
32}