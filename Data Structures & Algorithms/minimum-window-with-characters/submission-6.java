class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> maps = new HashMap<>();
        Map<Character, Integer> mapt = new HashMap<>();

        int need = t.length();
        int have = 0;
        for (char c : t.toCharArray()) {
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        String minS = "";
        // System.out.println();
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            if (mapt.containsKey(s.charAt(i))) {
                maps.put(s.charAt(i), maps.getOrDefault(s.charAt(i), 0) + 1);
                if (maps.get(s.charAt(i)) == mapt.get(s.charAt(i))) {
                    have+=maps.get(s.charAt(i));
                }
            }
            
             System.out.println(have);
            while (have == need) {
                if (i - j + 1 < min) {
                    min = i - j + 1;
                    minS = s.substring(j, i + 1);
                    //System.out.println(minS);
                     //System.out.println("j: "+j+" i: "+i);
                }

                if (mapt.containsKey(s.charAt(j))) {
                    maps.put(s.charAt(j), maps.get(s.charAt(j)) - 1);
                    if (maps.get(s.charAt(j)) < mapt.get(s.charAt(j))) {
                        have--;
                    }
                   
                }
                 j++;
                 if(have!=need){
                    i=j;
                    have=0;
                    maps.clear();
                 }
            }
            
                

        }

        return minS;
    }
}
