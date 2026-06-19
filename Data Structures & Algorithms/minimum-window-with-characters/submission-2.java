class Solution {
    public String minWindow(String s, String t) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int rp = 0;
        int min = Integer.MAX_VALUE;
String res="";
        for (char c : t.toCharArray()) {
            map.put(String.valueOf(c), map.getOrDefault(String.valueOf(c), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
             rp=i;
            Map<String, Integer> mapCopy = new HashMap<String, Integer>(map);

            if (map.containsKey(String.valueOf(s.charAt(i)))) {
                String tmpS = "";
                int count = 0;
                while (rp < s.length() && mapCopy.size() > 0) {
                    String value = String.valueOf(s.charAt(rp));
                    mapCopy.put(
                        value,
                         mapCopy.getOrDefault(
                            value,
                            0 
                            )-1);
                    if (mapCopy.get(value)<=0){
                                            mapCopy.remove(value);

                    }
                    tmpS += s.charAt(rp);
                    rp++;
                    count++;

                }

                if(count<min && mapCopy.size()==0){
                    min=count;
                    res = tmpS;
                }
            }
        }

        return res;
    }
}
