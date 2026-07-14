// Last updated: 7/14/2026, 2:12:09 PM
class Solution {
    public boolean isHappy(int n) {
        int result = n;

        while(result != 1 && result != 4){
            int sum = 0;
            while(result > 0){
                int d = result%10;
                sum += d*d;
                result = result/10;
            }
            result = sum;
        }
        if(result==1){
            return true;
        }
        else{
            return false;
        }
    }
}