class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList();
        Arrays.sort(candidates);
        backtrack(target, 0, candidates, new ArrayList());
        return res;
    }

    public void backtrack(int target, int i, int[] nums, List<Integer> curr) {
        if (target == 0) {
            if (!res.contains(curr)) {
                res.add(new ArrayList(curr));
            }
            return;
        }

        if (target < 0) {
            return;
        }
        if (i >= nums.length) {
            return;
        }

        curr.add(nums[i]);
                backtrack(target - nums[i], i + 1, nums, curr);
        curr.remove(curr.size() - 1);

            while (i +1<nums.length&&nums[i] == nums[i + 1]) {

                i++;
            }
        backtrack(target, i + 1, nums, curr);

        return;
    }
}
