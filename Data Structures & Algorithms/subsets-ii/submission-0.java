class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<List<Integer>> res2= new ArrayList<>();
        Set<Map<Integer,Integer>> set = new HashSet<>();
        res.add(new ArrayList<>());
        for(int i =0;i<nums.length;i++){
            int size = res.size();
            for(int j =0;j<size;j++){
                 List<Integer> tmp  = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }

        }

        for(int i =0;i<res.size();i++){
            Map<Integer,Integer> map = new HashMap<>();
            List<Integer> list =res.get(i); 
            for(int j=0;j<list.size();j++){
                map.put(
                    list.get(j),
                    map.getOrDefault(list.get(j), 0)+1 
                    );
            }            
            if(!set.contains(map)){
                res2.add(list);
                set.add(map);
            }


        }




        return res2;

    }
}
