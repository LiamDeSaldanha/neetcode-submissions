class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int[] res = new int[nums.length-k+1];

        for(int i =0;i<k-1;i++){
            pq.offer(nums[i]);
        }
        int count =0;
        for(int i=k-1;i<nums.length;i++){
            pq.offer(nums[i]);
            //System.out.println(pq);
            res[count]= pq.peek();
            count++;
            pq.remove(nums[i-(k-1)]); 
        }
        return res;
        
    }
}
