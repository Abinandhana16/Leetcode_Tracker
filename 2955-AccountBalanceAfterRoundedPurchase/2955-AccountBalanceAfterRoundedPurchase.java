// Last updated: 7/14/2026, 2:10:55 PM
class Solution {
    public int accountBalanceAfterPurchase(int p) {
        int round = Math.round(p/10.0f)*10;
        int diff = 100 - round;
        return diff;
    }
}