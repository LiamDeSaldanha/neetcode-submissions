class Solution {
    public String minWindow(String s, String t) {
        int lp = 0;
        int rp = 0;

        int count1 = 0;
        int count2 = 0;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        String res = "";

        for (char c : t.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
            map2.put(c, 0);
        }

        count1 = map1.keySet().size();

        while (rp < s.length()) {
            char c = s.charAt(rp);
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
                if (map2.get(c) == map1.get(c)) {
                    count2++;
                }
            }

            if (count1 == count2) {
                while (count1 == count2) {
                    char c2 = s.charAt(lp);

                    if (map2.containsKey(c2)) {
                        map2.put(c2, map2.get(c2) - 1);

                        if (map2.get(c2) < map1.get(c2)) {
                            count2--;
                            String temp = s.substring(lp, rp + 1);

                            if (res.length() == 0) {
                                res = temp;

                            } else {
                                if (temp.length() < res.length()) {
                                    res = temp;
                                }
                            }
                        }
                    }
                    lp++;
                }
            }

            rp++;
        }
        return res;
    }
}
