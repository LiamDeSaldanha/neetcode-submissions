class Solution {
    public int search(int[] nums, int target) {
        int lp =0;
        int rp =nums.length-1;
        int mp =0;

        while(lp<=rp){
            mp = (rp+lp)/2;

            if(nums[mp]==target){
                return mp;
            }
            else if(nums[mp]<target){
                lp++;
            }else{
                rp--;
            }
        }
        return -1;
    }
}
