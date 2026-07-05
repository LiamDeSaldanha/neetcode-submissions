class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res =0;
        Set<Character> set = new HashSet<>();

        int lp =0;
        int rp =0;

        while(rp<s.length()){
            if(set.contains(s.charAt(rp))){
                lp++;
                rp=lp;
                set.clear();
            }else{
                set.add(s.charAt(rp));
                rp++;
                res = Math.max(res,set.size());
            }

        }
        return res;

    }
}
