class Solution {
    public int characterReplacement(String s, int k) {

        int lp =0;
        int rp =0;
        int max =0;
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i ='A';i<='Z';i++){
            map.put(Character.valueOf((char)i), 0);
        }

        for(rp=0;rp<s.length();rp++){
            int windowLen = rp-lp+1;
            int freqMax=0;
            map.put(Character.valueOf(s.charAt(rp)), map.get(Character.valueOf(s.charAt(rp)))+1);
            for(int i ='A';i<='Z';i++){
            freqMax = Math.max(freqMax,map.get(Character.valueOf((char)i)));
            }

            if(windowLen-freqMax<=k){
                max = Math.max(max,windowLen);
            }else{

                map.put(
                    Character.valueOf(s.charAt(lp))
                ,map.get(Character.valueOf(s.charAt(lp)))-1
                );

                lp++;
                
            }



        }

        return max;
        
    }
}
