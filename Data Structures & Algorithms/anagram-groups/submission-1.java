class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        Map<Map<String,Integer>,List<String>> map = new HashMap();

        for(int i =0;i<strs.length;i++){

            Map<String,Integer> map2 = new HashMap();
            for(int j =0 ; j<strs[i].length();j++){
                map2.put(
                    String.valueOf(strs[i].charAt(j)),
                     map2.getOrDefault(String.valueOf(strs[i].charAt(j)), 0)+1
                     );
            }



            if(map.containsKey(map2)){
                List<String> tmp = map.get(map2);
                tmp.add(strs[i]);
            }else{
                List<String> tmp2 = new ArrayList();
                tmp2.add(strs[i]);
                map.put(
                    map2,
                     tmp2
                     );
            }


        }

        for(List<String> l:map.values()){
            res.add(l);
        }
        return res;


    }
}
