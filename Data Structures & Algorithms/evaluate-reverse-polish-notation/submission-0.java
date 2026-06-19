class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> list = new HashSet<>();

        list.add("+");
        list.add("-");
        list.add("*");
        list.add("/");
        
        for(int i =0 ; i<tokens.length;i++){

            if(list.contains(tokens[i])){
                int num2 = stack.pop();
                int num1 = stack.pop();
                int res = 0;
                if(tokens[i].equals("+")){
                    res = num1+num2;
                }else if (tokens[i].equals("-")){
                    res = num1-num2;

                }else if (tokens[i].equals("*")){
                    res = num1*num2;
                    
                }else if (tokens[i].equals("/")){
                    res = num1/num2;
                    
                }

                stack.push(res);
            }else{
                stack.push(Integer.valueOf(tokens[i]));
            }


        }
        return stack.pop();


        
    }
}
