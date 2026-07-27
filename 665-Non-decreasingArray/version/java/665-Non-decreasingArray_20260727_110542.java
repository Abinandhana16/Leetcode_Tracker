// Last updated: 7/27/2026, 11:05:42 AM
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3	for (int i=1, modified=0, prev = nums[0]; i<nums.length; i++) {
4		if (nums[i] < prev) {
5			if (modified++ == 1) return false;
6			if (i>=2 && nums[i-2] > nums[i]) continue;
7		}
8		prev = nums[i];
9	}
10	return true;
11
12    }
13}