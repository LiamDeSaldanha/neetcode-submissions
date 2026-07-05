class Solution {
    public int maxProfit(int[] prices) {
        int lp = 0;
        int rp = 0;

        int max = 0;
        int profit = 0;
        

            while (rp < prices.length ) {
                if( prices[lp] < prices[rp]){

                
                profit = Math.max(profit, prices[rp] - prices[lp]);
                }else{
                    lp=rp;
                }
                rp++;

            }
            
        

        return profit;
    }
}
