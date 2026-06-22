class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String,Integer> sMap=new HashMap();
        Map<String,Integer> tMap=new HashMap();


        for(char c:s.toCharArray()){
            sMap.put(
                String.valueOf(c),
                sMap.getOrDefault(String.valueOf(c), 0)+1
            );
        }

        
        for(char c:t.toCharArray()){
            tMap.put(
                String.valueOf(c),
                tMap.getOrDefault(String.valueOf(c), 0)+1
            );
        }

        if(tMap.equals(sMap)){
            return true;
        }else{
            return false;
        }
    }
}
