// Last updated: 8/4/2026, 11:42:33 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]*=nums[i];
            
        }
        Arrays.sort(nums);
        return nums;
        
    }
}