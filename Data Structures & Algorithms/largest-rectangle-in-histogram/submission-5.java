class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> index = new Stack<>();
        Stack<Integer> height = new Stack<>();

        int max = -1;

        for (int i = 0; i < heights.length; i++) {
            if (height.isEmpty() && index.isEmpty()) {
                height.push(heights[i]);
                index.push(i);
                continue;
            }

            if (heights[i] < height.peek()) {
                int h = 0;
                int idx = 0;
                while (!height.isEmpty() && heights[i] < height.peek()) {
                    h = height.pop();
                    idx = index.pop();
                    max = Math.max(max, h * (i - idx));
                }

                height.push(heights[i]);
                index.push(idx);

            } else {
                height.push(heights[i]);
                index.push(i);
                max = Math.max(max, heights[i]);
            }
        }
        while (!height.isEmpty()) {
            int h = height.pop();
            int idx = index.pop();

            max = Math.max(max, h * (heights.length - idx));
        }

        return max;
    }
}
