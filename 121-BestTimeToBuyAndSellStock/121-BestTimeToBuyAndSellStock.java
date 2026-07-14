// Last updated: 7/14/2026, 2:12:15 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxp = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            else{
           
                int profit = prices[i] - min;
                if(profit>maxp){
                    maxp = profit;
                }

            }
        }
        return maxp;
    }
}