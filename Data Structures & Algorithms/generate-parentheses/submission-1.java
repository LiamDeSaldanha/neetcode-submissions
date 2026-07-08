class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String start = "(";
        Stack<String> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            String tmp = stack.pop();
            int l=0;
            int r=0;
            for(int i=0;i<tmp.length();i++){
                if(tmp.charAt(i)=='('){
                    l++;
                }else{
                    r++;
                }
            }
            if(l<n){
                String left = genForward(tmp);

            
            if (left.length() < n * 2) {
                stack.push(left);
            } else if (left.length() == n * 2) {
                res.add(left);
            }}

            if(r<n && r<l){

            String right = genBackward(tmp);
            if (right.length() < n * 2) {
                stack.push(right);
            } else if (right.length() == n * 2) {
                res.add(right);
            }
            }
        }

        System.out.println(res);
        return res;
    }

    public String genForward(String s) {
        s += '(';

        return s;
    }

    public String genBackward(String s) {
        s += ')';

        return s;
    }
}
