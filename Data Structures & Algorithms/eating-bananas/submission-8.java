class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lp=1;
        int max = Integer.MIN_VALUE;
        for(int i:piles){
            max = Math.max(max,i);
        }
        int rp =max;
        int mp=0;
        int min = Integer.MAX_VALUE;
        while(lp<=rp){
            mp = lp + (rp - lp) / 2;

            long sum = 0;
            for(int i =0;i<piles.length;i++){
                sum += (piles[i] + mp - 1L) / mp;
            }

            if(sum<=h){
                min = Math.min(min,mp);
                rp= mp-1;
            }else{
                lp=mp+1;

            }




        }

        return min;
        
    }
}
