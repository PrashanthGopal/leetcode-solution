class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int maxProfit = 0;
        int lowestBuy = prices[0];
        for(int i =1; i<prices.length;i++){
            int profit = prices[i] - lowestBuy;
            maxProfit = Integer.max(maxProfit, profit);
            lowestBuy = Integer.min(lowestBuy, prices[i]);
            
        }
        return maxProfit;
    }
}