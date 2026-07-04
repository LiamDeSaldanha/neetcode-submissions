class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        String snew = "";
        int a = (int) 'a' ;
        int z = (int) 'z' ;
        for(int i = 0 ; i<s.length();i++){
            if((s.charAt(i)>=a && s.charAt(i)<=z ) || s.charAt(i)>=(int)'0' &&s.charAt(i)<=(int)'9'){
                snew += String.valueOf(s.charAt(i));
            }
        }
        System.out.println(snew);
        s= snew;
        int lp =0;
        int rp =s.length()-1;
        while(lp<=rp){
            if(s.charAt(lp)!= s.charAt(rp)){
                return false;
            }
            lp++;
            rp--;

        }

        return true;
        
    }
}
