// Last updated: 7/14/2026, 2:12:53 PM
class Solution {
    public boolean isPalindrome(int n) {
        if(n<0){
            return false;
        }
        int rev =0;
        int ncopy = n;

        while(n>0){
            rev = (rev*10)+(n%10);
            n/=10;
        }
        return rev == ncopy;
    }
}