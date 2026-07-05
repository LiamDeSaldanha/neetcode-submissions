class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Set<Set<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i =0;i<nums.length;i++){
            int num_i = nums[i];

            for(int j=0;j<nums.length;j++){
                int num_j = nums[j];
                int num_k = -1*(num_i+num_j);
                if(j!=i && map.containsKey(num_k) && map.get(num_k)!=j &&map.get(num_k)!=i ){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(num_i);
                    tmp.add(num_j);
                    tmp.add(num_k);
                    Set<Integer> set2 = new HashSet<>();
                    set2.add(num_i);
                    set2.add(num_k);
                    set2.add(num_j);
                    if(!res.contains(tmp) && !set.contains(set2)){
                        res.add(tmp);
                        set.add(set2);
                    }
                }



            }


        }
        return res;

    }
}
