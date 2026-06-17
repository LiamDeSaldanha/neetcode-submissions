class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> dif = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        for(int i =0;i<nums.length;i++){


            if (dif.containsKey(nums[i])){

              res[0] = dif.get(nums[i]);
              res[1] = i;
             return res;
            }
            dif.put(target-nums[i],i);
        }
        return res;

        
    }
}
