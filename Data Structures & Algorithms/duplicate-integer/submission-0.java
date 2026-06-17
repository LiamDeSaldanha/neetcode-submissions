class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for ( int n :nums){
            if (map.containsKey(n)){
                return true;
            }else{
                map.put(n,1);
            }
        }
        return false;
    }
}