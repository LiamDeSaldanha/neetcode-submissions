class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<String, Integer>, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            Map<String, Integer> tmpMap = new HashMap<>();
            for (int j = 0; j < strs[i].length(); j++) {
                tmpMap.put(String.valueOf(strs[i].charAt(j)),
                    tmpMap.getOrDefault(String.valueOf(strs[i].charAt(j)), 0) + 1);
            }
            List<String> tmpList = new ArrayList<>();
            tmpList.add(strs[i]);
            if (map.containsKey(tmpMap)) {
                List<String> newMap = map.get(tmpMap);
                newMap.add(strs[i]);
                map.put(tmpMap,newMap );
            } else {
                map.put(tmpMap, tmpList);
            }
        }
        System.out.println(map.values());
        for (List<String> x:map.values()) {
            res.add(x);
        }
        return res;
    }
}
