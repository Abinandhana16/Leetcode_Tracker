// Last updated: 7/14/2026, 2:12:28 PM
class Solution {
    public int searchInsert(int[] a, int k) {
        int s = 0;
        int e = a.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(a[mid]==k){
                return mid;
            }
            else if(a[mid]<k){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return s;
    }
}