// Last updated: 7/29/2026, 12:23:38 PM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        map.put(0, -1);
6
7        int sum = 0;
8        int max = 0;
9
10        for (int i = 0; i < nums.length; i++) {
11
12            if (nums[i] == 0)
13                sum--;
14            else
15                sum++;
16
17            if (map.containsKey(sum)) {
18
19                max = Math.max(max, i - map.get(sum));
20
21            } else {
22
23                map.put(sum, i);
24            }
25        }
26
27        return max;
28    }
29}