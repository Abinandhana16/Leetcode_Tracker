// Last updated: 8/4/2026, 11:37:58 AM
1class Solution {
2    public int removeDuplicates(int[] arr) {
3        int i =0;
4        for (int j=0;j<arr.length;j++){
5            if(arr[i]!=arr[j]){
6                i++;
7                arr[i]= arr[j];
8            }
9        }
10        return i+1;
11    }
12}