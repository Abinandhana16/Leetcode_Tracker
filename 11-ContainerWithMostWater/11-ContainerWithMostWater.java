// Last updated: 7/14/2026, 2:12:49 PM
class Solution {
    public int maxArea(int[] a) {
         int i = 0;
        int j = a.length - 1;

        int maxWater = 0;

        while(i < j) {

            int height = Math.min(a[i], a[j]);

            int width = j - i;

            int water = height * width;

            if(water > maxWater) {
                maxWater = water;
            }

            if(a[i] < a[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxWater;
    }
}