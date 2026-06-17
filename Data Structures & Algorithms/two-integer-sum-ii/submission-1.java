class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp =0 ;
        int rp =numbers.length-1 ;
        int sum=0;
        int[] res = new int[2];
        while(lp<rp){
            sum = numbers[lp]+numbers[rp];
            if(sum == target){
                res[0] = lp+1;
                res[1]=rp+1;
                return res;
            }else if ( sum>target){
                rp--;
            }else{
                lp++;
            }
        }
        return res;


    }
}
