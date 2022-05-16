class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int prevprice = prices[0];
        for(int i=1;i<prices.length;i++){
               if(prevprice > prices[i]){
                   prevprice = prices[i];
               }
                else if(prevprice < prices[i]){
                    if(maxprofit < prices[i] - prevprice){
                        maxprofit = prices[i] - prevprice;
                    }
                }
        }
        return maxprofit;
    }
}
