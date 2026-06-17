class Solution {
    public boolean isPalindrome(String s) {
        int ordA = 'A';
        int ordZ = 'Z';
        int orda = 'a';
        int ordz = 'z';
        int ordZero = '0';
        int ordNine = (int)'9' ;
        s = s.toLowerCase();
        s = s.replace(" ", "");
        String sNew ="";
        for(int i =0;i<s.length();i++){
            
            if(s.charAt(i)>=ordA && s.charAt(i)<=ordZ
            ||s.charAt(i)>=orda && s.charAt(i)<=ordz
            ||s.charAt(i)>=ordZero && s.charAt(i)<=ordNine

             ){
                sNew+=s.charAt(i);
             }

        }


        
        int lp = 0 ;
        int rp = sNew.length()-1 ;
        while(lp<=rp){
            
            if(sNew.charAt(lp) != sNew.charAt(rp)){
                return false;

            }
            lp++;
            rp--;

        }

        return true;
    }
}
