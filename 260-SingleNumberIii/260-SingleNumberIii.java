// Last updated: 7/14/2026, 2:11:57 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean unique = true;

            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                result[index++] = nums[i];
            }
        }

        return result;
    }
}