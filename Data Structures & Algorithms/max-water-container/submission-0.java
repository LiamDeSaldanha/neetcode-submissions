class Solution {
    public int maxArea(int[] heights) {
        int lp = 0 ;
        int rp = heights.length -1;
        int max = 0;
        while(lp<rp){
            int area = (rp-lp)*Math.min(heights[lp],heights[rp]);
            max = Math.max(max,area);

            if(heights[lp]<heights[rp]){
                lp++;
            }else{
                rp--;
            }



        }
        return max;


    }
}
