// Last updated: 7/29/2026, 12:36:57 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int sum=0;
4        Arrays.sort(nums);
5        int temp = nums[0];
6        for(int i=0;i<nums.length;i++){
7            sum+=nums[i]-temp;
8
9        }
10        return sum;
11        
12    }
13}