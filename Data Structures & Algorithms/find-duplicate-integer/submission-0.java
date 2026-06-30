class Solution {
    public int findDuplicate(int[] nums) {
        String s = "";
        for(int i:nums){
            if(s.contains(","+String.valueOf(i)+",")){
                return i;
            }
            s+=","+String.valueOf(i)+",";
        }
        return -1;

        
    }
}
