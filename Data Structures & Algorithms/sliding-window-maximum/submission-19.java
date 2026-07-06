class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int lp = 0;
        if(nums.length==1){
            res[0]=nums[0];
            return res;
        }
        
        for (int i = 0; i < nums.length; i++) {
            
                while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                    deque.pollLast();
                }
                deque.offer(i);

                if (lp > deque.getFirst()) {
                    deque.removeFirst();
                }

                if (i - k + 1 >= 0) {
                    res[i - k + 1] = nums[deque.peek()];
                    System.out.println(nums[deque.peek()]);
                    lp++;
                }
            
        }
        return res;
    }
}
