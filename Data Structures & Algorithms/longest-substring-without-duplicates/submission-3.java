class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lp =0;
        int rp =0;
        Map<Character,Integer> map = new HashMap<>();
        int max=0;
        while(rp<s.length()){
            char c = s.charAt(rp);
            if(map.containsKey(c)){
                

                while(s.charAt(lp)!=c){
                    map.remove(s.charAt(lp));
                    lp++;

                }
                lp++;
                map.remove(c);
                


   
                
            }
                
                map.put(c,rp);
            
                max = Math.max(max,rp-lp+1);
            

            rp++;
        }
        return max;


    }
}
