class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<List<Integer>> set = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int lp = i+1;
            int rp = nums.length-1;
            
            
            while (lp < rp) {
                int sum = nums[lp] + nums[rp] + nums[i];

                if (sum == 0 ) {
                    List<Integer> tmpList = new ArrayList<>();
                    tmpList.add(nums[i]);
                    tmpList.add(nums[lp]);
                    tmpList.add(nums[rp]);

                    
                if (!res.contains(tmpList)){
                    res.add(tmpList);

                }
            rp--;
                    lp++;
            

            


                } else if (sum > 0) {
                    rp--;
                } else {
                    lp++;
                }
            }
            
            
            


        }

        return res;
    }
}
