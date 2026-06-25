class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        int lp =0; 
        int rp =0; 
        

        for(lp =0;lp<nums.length-k+1;lp++){
            int max = Integer.MIN_VALUE;
            for(rp=lp;rp<lp+k;rp++){
                max = Math.max(max,nums[rp]);
            }
            res[lp]=max;
        }
        return res;
    }
}
