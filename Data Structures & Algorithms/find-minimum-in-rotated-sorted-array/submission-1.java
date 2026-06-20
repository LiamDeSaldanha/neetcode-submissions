class Solution {
    public int findMin(int[] nums) {
        int lp =0;
        int rp =nums.length-1;
        int mp =0;
        int min = Integer.MAX_VALUE;
        
        
        while(lp<=rp){
            System.out.println("lp: "+nums[lp]);
            System.out.println("rp: "+nums[rp]);
            mp = (lp+rp)/2;
            System.out.println("mp: "+nums[mp]);

            min = Math.min(min,nums[mp]);
            if(nums[lp]>nums[rp]){
                if(mp>0&&mp<nums.length-1){
                    if(nums[mp-1]<nums[mp+1] && nums[rp]>nums[mp] ){
                        
                        rp=mp-1;
                    }else{
                        lp = mp+1;
                    }
                }else{
                lp = mp+1;
                    
                }
            }else{
                rp=mp-1;
            }





        }

        return min;


    }
}
