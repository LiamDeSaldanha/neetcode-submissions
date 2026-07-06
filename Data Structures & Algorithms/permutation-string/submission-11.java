class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();


        for(char c= 'a';c<='z';c++){
            map1.put(c, 0);
        }
        for(char c= 'a';c<='z';c++){
            map2.put(c, 0);
        }

        for(char c: s1.toCharArray()){
            map1.put(c, map1.get(c)+1);
        }
        
        int lp=0;
        int rp=0;
        
        while(rp<s2.length()){
            char c = s2.charAt(rp);
            map2.put(c, map2.get(c)+1);
            
            
            if(map1.get(c) <map2.get(c)){
                

                while(s2.charAt(lp)!=c){
                    map2.put(s2.charAt(lp), map2.get(s2.charAt(lp))-1);
                    lp++;
                }
                map2.put(s2.charAt(lp), map2.get(s2.charAt(lp))-1);
                lp++;


            }

            if( map2.equals(map1)){
                return true;
            }



            rp++;

        }

        return false;

        
    }
}
