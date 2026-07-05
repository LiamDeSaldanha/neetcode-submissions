class Solution {
    public int maxProfit(int[] prices) {
        int lp = 0;
        int rp = 0;

        int max = 0;
        int profit = 0;
        for (lp = 0; lp < prices.length; lp++) {
            rp = lp + 1;

            while (rp < prices.length && prices[lp] < prices[rp]) {
                profit = Math.max(profit, prices[rp] - prices[lp]);

                rp++;
            }
            
        }

        return profit;
    }
}
