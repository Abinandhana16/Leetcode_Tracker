// Last updated: 7/14/2026, 2:10:58 PM
class Solution {
    public int findDelayedArrivalTime(int t1, int t2) {
        if(t1+t2==24){
            return 0;
        }
        if(t1+t2>24){
            return (t1+t2)%24;
        }
        else{
            return t1+t2;
        }
    }
}