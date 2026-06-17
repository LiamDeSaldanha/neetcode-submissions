class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        Map<String,Integer> map2 = new HashMap<String,Integer>();

        for(int i=0;i<s.length();i++){
            map.put(String.valueOf(s.charAt(i)),map.getOrDefault(String.valueOf(s.charAt(i)),0)+1);
        }

        
        for(int i=0;i<t.length();i++){
            map2.put(String.valueOf(t.charAt(i)),map2.getOrDefault(String.valueOf(t.charAt(i)),0)+1);
        }
        System.out.println(map);
        System.out.println(map2);
        if ( map2.equals(map)){
            return true;
        }
        return false;

    }
}
