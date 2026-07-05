class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res =0;
        Set<Character> set = new HashSet<>();

        int lp =0;
        int rp =0;

        while(rp<s.length()){
            if(set.contains(s.charAt(rp))){
                while(set.contains(s.charAt(rp))){
                    set.remove(s.charAt(lp));
                    lp++;

                }
                
                
            }else{
                set.add(s.charAt(rp));
                rp++;
                res = Math.max(res,set.size());
            }

        }
        return res;

    }
}
