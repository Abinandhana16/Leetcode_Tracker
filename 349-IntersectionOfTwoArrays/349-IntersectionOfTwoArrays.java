// Last updated: 7/14/2026, 2:11:41 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[Math.min(nums1.length,nums2.length)];
        int k = 0;
        for(int i=0;i<nums1.length;i++){
            boolean visited = false;
            for(int j=0;j<i;j++){
                if(nums1[i]==nums1[j]){
                    visited = true;
                    break;
                }
            }
            if(visited)
                continue;

                boolean found = false;
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        found = true;
                        break;
                    }
                }
                if(found){
                    temp[k] = nums1[i];
                    k++;
                }
        }
                int[] ans  = new int[k];
                for(int i=0;i<k;i++){
                    ans[i] = temp[i];
                }
                return ans; 
    
}
    }
