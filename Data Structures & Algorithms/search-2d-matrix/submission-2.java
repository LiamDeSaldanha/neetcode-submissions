class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length;
        System.out.println(cols);
        System.out.println(matrix.length);
        int lp =0;
        int rp = (matrix[0].length * matrix.length)-1;
        int mp=0;
        while(lp<=rp){
            mp = (lp+rp)/2;
            int row = mp/cols;
            int col = mp%cols;

            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
}
