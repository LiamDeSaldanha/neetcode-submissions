class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> open = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        open.put('[',']');
        open.put('(',')');
        open.put('{','}');
        
        for(int i =0;i<s.length();i++){
            if(open.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));


            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character c = stack.pop();
                System.out.println(open.get(c));
                System.out.println(s.charAt(i));
                if(open.get(c)!=s.charAt(i)){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }

        return true;

    }
}
