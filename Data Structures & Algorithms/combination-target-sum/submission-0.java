class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        backtrack(target,0,new ArrayList(),nums);
        return res;
    }

    public void backtrack(int target,int i,List<Integer> curr,int[] nums){

        if(target==0){
            res.add(new ArrayList(curr));
            return;
        }
        if(target<0){
            return;
        }

        if(i>=nums.length){
            return;
        }
        
        curr.add(nums[i]);
        backtrack(target -nums[i],i,curr,nums);
        curr.remove(curr.size()-1);
        backtrack(target ,i+1,curr,nums);
        
        return;

    }
}
