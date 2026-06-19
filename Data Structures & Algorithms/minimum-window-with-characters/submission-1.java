class Solution {
    public String minWindow(String s, String t) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> shortest = new HashMap<String, Integer>();
        List<Map<String, Integer>> listMap = new ArrayList<>();
        int rp = 0;
        int mapSum = 0;
        int min = Integer.MAX_VALUE;
String res="";
        for (char c : t.toCharArray()) {
            map.put(String.valueOf(c), map.getOrDefault(String.valueOf(c), 0) + 1);
        }
                System.out.println(map);

        int windowLen = s.length();
        for (int i = 0; i < s.length(); i++) {
             rp=i;
            Map<String, Integer> mapCopy = new HashMap<String, Integer>(map);
                System.out.println("i "+s.charAt(i));

            if (map.containsKey(String.valueOf(s.charAt(i)))) {
                String tmpS = "";
                int count = 0;
                while (rp < s.length() && mapCopy.size() > 0) {
                    mapCopy.put(
                        String.valueOf(s.charAt(rp)),
                         mapCopy.getOrDefault(
                            String.valueOf(s.charAt(rp)),
                            0 
                            )-1);
                    if (mapCopy.get(String.valueOf(s.charAt(rp)))<=0){
                                            mapCopy.remove(String.valueOf(s.charAt(rp)));

                    }
                    tmpS += s.charAt(rp);
                    rp++;
                    count++;

                }
                System.out.println(tmpS);

                if(count<min && mapCopy.size()==0){
                    min=count;
                    res = tmpS;
                }
            }
        }

        return res;
    }
}
