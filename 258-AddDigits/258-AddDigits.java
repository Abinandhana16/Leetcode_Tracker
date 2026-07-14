// Last updated: 7/14/2026, 2:11:59 PM
class Solution {
    public int addDigits(int n) {
        if(n==0)
        return 0;
        if(n%9==0)
        return 9;
        else
        return n%9;
    }
}