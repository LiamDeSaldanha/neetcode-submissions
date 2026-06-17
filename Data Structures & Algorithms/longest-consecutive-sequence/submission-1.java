class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for ( int i = 0;i<nums.length;i++){
            set.add(nums[i]);
            
        }
        for ( int i = 0;i<nums.length;i++){
            
            if (!set.contains(nums[i]-1)){
                int j =nums[i];
                int count =0;
                while(set.contains(j)){
                    count++;
                    j++;
                }
                max = Math.max(max,count);

            }



        }



        
       

        return max;

    }
}
