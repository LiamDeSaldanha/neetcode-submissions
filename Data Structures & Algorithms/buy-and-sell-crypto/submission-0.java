class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;
        int lp=0;
        int rp=0;

        while(rp <prices.length){
            int profit = prices[rp]-prices[lp];
            if(profit<0){
                lp=rp;
            }else{
                max = Math.max(max,profit);
            }


            rp++;
        }        
        return max;
    }
}
