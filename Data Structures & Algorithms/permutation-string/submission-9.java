class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int lp = 0;
        int rp = 0;
        Map<Character, Integer> map = new HashMap<>();
                Map<Character, Integer> tmp = new HashMap<>();

        int s1Len = s1.length();

        for (char c : s1.toCharArray()) {
            map.put(Character.valueOf(c), map.getOrDefault(Character.valueOf(c), 0) + 1);
        }
    
        for (lp = 0; lp < s2.length(); lp++) {
            Character c = s2.charAt(lp);
            if (map.containsKey(c) && lp + s1Len  <= s2.length()) {
                String sub = s2.substring(lp, lp + s1Len );
                tmp.clear();
                for (char cc : sub.toCharArray()) {
                    tmp.put(Character.valueOf(cc), tmp.getOrDefault(Character.valueOf(cc), 0) + 1);
                }
                
                if(map.equals(tmp)){
                    return true;
                }
            }
        }

        return false;
    }
}
