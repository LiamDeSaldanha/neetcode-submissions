class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        for ( int i=0;i<arr.length;i++){
            arr[i] =1;
        }
        //forward loop
        int runner=1;
        for ( int i =0;i<nums.length;i++){
            
            if(i!=0){
                arr[i] = runner;
                
            }
            runner *= nums[i];
            
        }
        runner=1;
        for ( int i =nums.length-1;i>=0;i--){

                
                arr[i] = runner*arr[i];
                

            
            runner *= nums[i];
            
        }
        return arr;
    }
}  
