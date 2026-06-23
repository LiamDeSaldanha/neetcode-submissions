class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.offer(i);
        } 
        
        for(int i=0;i<nums.length-k;i++){
            System.out.println(pq.poll());
        }
        return pq.poll();
    }
}
