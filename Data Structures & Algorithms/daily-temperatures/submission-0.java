class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (i == 0) {
                stack.push(i);

            } else {
                if (temperatures[stack.peek()] < temperatures[i]) {
                    while (!stack.isEmpty() &&temperatures[stack.peek()] < temperatures[i]) {
                        int pos = stack.pop();
                        res[pos] = i-pos;
                    }
                    stack.push(i);

                } else {
                    stack.push(i);
                }
            }
        }
        return res;
    }
}
