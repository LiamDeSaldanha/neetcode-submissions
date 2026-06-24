class Solution {
    public int countSubstrings(String s) {
        int lp =0;
        int rp =0;
        List<String> res= new ArrayList<>();
        for(int i=0;i<s.length();i++){

            lp=i;
            rp=i;
            String tmp ="";
            while(lp>=0 && rp<s.length()&&s.charAt(lp)==s.charAt(rp)){
                if(lp==rp){
                    tmp +=s.charAt(lp);                    
                }else{
                tmp=s.charAt(lp)+tmp+s.charAt(rp);

                }
                lp--;
                rp++;
                res.add(tmp);

            }
            lp =i;
            rp=i+1;
            while(lp>=0 && rp<s.length()&&s.charAt(lp)==s.charAt(rp)){
                
                tmp=s.charAt(lp)+tmp+s.charAt(rp);

                lp--;
                rp++;
                res.add(tmp);

            }


        }
        //System.out.println(res);

        return res.size();
    }
}
