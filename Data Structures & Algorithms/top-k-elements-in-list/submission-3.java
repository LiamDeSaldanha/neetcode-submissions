class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,List<Integer>> freqMap = new HashMap<>();
        int[] res = new int[k];
        for ( int i:nums){
            map.put(
                i,
                map.getOrDefault(i,0)+1
            );
        }
        
        for ( int i :map.keySet()){
            List<Integer> tmp= new ArrayList<>();
            if (freqMap.containsKey(map.get(i))){
                tmp = freqMap.get(map.get(i));
                tmp.add(i);
freqMap.put(
                map.get(i),
                tmp
                
            );
            }else{
                tmp.add(i);
freqMap.put(
                map.get(i),
                tmp
            );
            }
            
            
            
            
        }
        int j=0;
        System.out.println(freqMap);
        for(int i = nums.length;j!=k;i--){
            if(freqMap.containsKey(i)){
                
                for(Integer l:freqMap.get(i)){
                    res[j] = l;
                    j++;
                }
            }
        }
        return res;

    }
}
