class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c = 'A';c<='Z';c++){
            map.put(c, 0);
        }

        int lp =0;
        int rp =0;
        int res = 0;

        while(rp<s.length()){

            map.put(s.charAt(rp), map.get(s.charAt(rp))+1);

            int max = 0;
            for(Character c:map.keySet()){
                max = Math.max(max,map.get(c));
            }

            if((rp-lp+1)-max<=k){

                res = Math.max(res,rp-lp+1);

            }else{
                map.put(s.charAt(lp), map.get(s.charAt(lp))-1);
                lp++;
            }


            rp++;



        }

        return res;



    }
}
