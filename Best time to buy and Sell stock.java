class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        
        int buy = prices[0];
        int sell = prices[0];
        
        for(int i=1;i<prices.length;i++){
            if(buy < prices[i]){
                total += prices[i] - buy;
            }
            buy = prices[i];
            sell = prices[i];
        }
        
        return total;
    }
}
