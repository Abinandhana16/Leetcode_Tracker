// Last updated: 7/14/2026, 2:12:20 PM
class Solution {
    public int[] plusOne(int[] arr) {
        int carry = 1;
        for(int i=arr.length-1;i>=0;i--){
            int sum = arr[i]+carry;
            arr[i] = sum%10;
            carry = sum/10;
            if(carry==0){
                return arr;
            }
        }
            int[]result = new int[arr.length+1];
            result[0] =1;
            return result;
        
        
    }
}