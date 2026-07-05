class Solution {
    public int trap(int[] height) {
        int lp = 0;
        int rp = height.length-1;

        int leftMax = height[lp];
        int rightMax = height[rp];

        int res =0;

        while(lp<rp){

            if(leftMax<=rightMax){
                lp++;
                leftMax = Math.max(leftMax,height[lp]);
                res+= leftMax-height[lp];
            }else{
                rp--;
                rightMax = Math.max(rightMax,height[rp]);
                res+= rightMax-height[rp];

            }


        }
        return res;




    }
}
