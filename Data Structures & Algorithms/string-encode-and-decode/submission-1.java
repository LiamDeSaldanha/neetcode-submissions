class Solution {

    public String encode(List<String> strs) {
        String res = "";
        int offset = 100;
        for( String s:strs){
            int sLen = s.length()+offset;
            res+= String.valueOf(sLen)+s;




        }
        return res;



    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int pointer = 0;
        while(pointer<str.length()){
            int len = Integer.valueOf(str.substring(pointer,pointer+3))-100;
            pointer+=3;
            String word="";
            for (int i = 0;i<len;i++){
                word+= str.charAt(i+pointer);
            }
            pointer+=len;
            
            res.add(word);

        }

        return res;
        



    }
}
