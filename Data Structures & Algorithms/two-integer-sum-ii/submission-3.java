class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res  = new int[2];

        int lp=0;
        int rp=numbers.length-1;


        while(lp<rp){

            int sum = numbers[lp]+numbers[rp];
            if(sum==target){
                res[0] = lp+1;
                res[1] = rp+1;
                return res; 
            }else if (sum<target){
                lp++;
            }else{
                rp--;
            }


        }
        return res;





    }
}
