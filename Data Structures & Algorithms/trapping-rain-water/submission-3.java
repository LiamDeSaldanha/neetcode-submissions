class Solution {
    public int trap(int[] height) {
        int max =0;
        int[] forward = new int[height.length];
        int[] backward = new int[height.length];
        int[] res = new int[height.length];

        for(int i =0; i<height.length;i++){
            
            forward[i] = Math.max(0,max-height[i]);
            max = Math.max(max,height[i]);
            
        }
         max =0;

        for(int i =height.length-1; i>=0;i--){
            
            backward[i] = Math.max(0,max-height[i]);
            max = Math.max(max,height[i]);
            
        }   
        int sum =0;
        for(int i =0;i<height.length;i++){
            res[i] = Math.min(forward[i],backward[i]);
            sum+=res[i];
        }


        return sum;

    }
}
