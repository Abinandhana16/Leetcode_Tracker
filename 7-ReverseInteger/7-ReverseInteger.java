// Last updated: 7/14/2026, 2:12:56 PM
class Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x !=0){
            rev  = rev*10+(x%10);
            x=x/10;
            if(rev<Integer.MIN_VALUE || Integer.MAX_VALUE<rev){
                return 0;
            }      
        }
        return(int)rev;
         
    }
}