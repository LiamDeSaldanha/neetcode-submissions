class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Queue<List<Integer>> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        queue.offer(new ArrayList<>());
        List<List<Integer>> list = new ArrayList<>();
        int count = 0;
            System.out.println(queue);

        while (!queue.isEmpty() && count<=nums.length-1) {

            list.add( queue.poll());

            for (int i = 0; i < list.size(); i++) {

                res.add(list.get(i));
                List<Integer> tmp2 = new ArrayList<>( list.get(i));
                tmp2.add(nums[count]);
                    res.add(tmp2);

                
            }
            list.clear();

            if (queue.isEmpty() && count!= nums.length-1) {
                count++;
                for (int i = 0; i < res.size(); i++) {
                    queue.offer(res.get(i));
                }
                res.clear();
            }
        }

        return res;
    }
}
