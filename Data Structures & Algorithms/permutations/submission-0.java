class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Queue<List<Integer>> q = new LinkedList();
        int pos = 0;
        ArrayList<Integer> x = new ArrayList();
        x.add(nums[pos]);
        q.offer(x);
        pos++;
        List<Integer> list;
        List<List<Integer>> res = new ArrayList();
        List<List<Integer>> tmp2 = new ArrayList();
        System.out.println(q);

        while (!q.isEmpty() && pos < nums.length) {
            list = q.poll();
            for (int i = 0; i <= list.size(); i++) {
                ArrayList<Integer> tmp = new ArrayList(list);
                tmp.add(i, nums[pos]);
                tmp2.add(tmp);
            }

            if (q.isEmpty()) {
                for (int i = 0; i < tmp2.size(); i++) {
                    q.offer(tmp2.get(i));
                }
                tmp2.clear();

                pos++;
            }
        }
        while (!q.isEmpty()) {
            res.add(q.poll());
        }

        return res;
    }
}
