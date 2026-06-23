class Solution {
    public String longestPalindrome(String s) {
        int lp = 0;
        int rp = 0;
        int max = Integer.MIN_VALUE;

        String maxS = "";
        
            for (int i = 0; i < s.length(); i++) {
                lp = i;
                rp = i;
                while (lp >= 0 && rp < s.length()&&s.charAt(lp) == s.charAt(rp)) {
                     
                        int diff = (rp ) - (lp ) + 1;
                        if (diff > max) {
                            max = diff;
                            maxS = s.substring((lp ), rp+1);
                        }
                    lp--;
                    rp++;
                }

                lp = i;
                rp = i + 1;
                while (lp >= 0 && rp < s.length() &&s.charAt(lp) == s.charAt(rp)) {
                        int diff = (rp ) - (lp ) + 1;
                        if (diff > max) {
                            max = diff;
                            maxS = s.substring((lp ), rp+1);
                        }
                    
                    lp--;
                    rp++;
                }
            }
        
            
        
        
        return maxS;
    }
}
