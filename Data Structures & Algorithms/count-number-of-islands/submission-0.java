class Solution {
    int rows = -1;
        int cols = -1;
    public int numIslands(char[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        int countIslands =0;
         rows = grid.length;
         cols = grid[0].length;
        for(int i = 0 ; i<rows;i++ ){
            for(int j =0;j<cols;j++){

                if(grid[i][j]=='1' && visited[i][j]!=1){
                    bfs(i,j,grid,visited);
                    countIslands+=1;
                }

            }
        }
        return countIslands;


    }

    public void bfs(int row,int col,char[][] grid,int[][]visited){
        Queue<List<Integer>> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        list.add(row);
        list.add(col);
        queue.offer(list);
        while(!queue.isEmpty()){
        List<Integer> tmp = queue.poll();
        row =tmp.get(0);
        col =tmp.get(1); 
        visited[row][col]=1;

        if(row>0 && grid[row-1][col]=='1' && visited[row-1][col]!=1 ){
            
            queue.offer(new ArrayList<>(List.of(row-1,col)));
            
        }

        if(row<rows-1 && grid[row+1][col]=='1'&& visited[row+1][col]!=1 ){
            
            queue.offer(new ArrayList<>(List.of(row+1,col)));
            
        }

        if(col>0 && grid[row][col-1]=='1'&&visited[row][col-1]!=1 ){
            
            queue.offer(new ArrayList<>(List.of(row,col-1)));
            
        }

        if(col<cols-1 && grid[row][col+1]=='1'&&visited[row][col+1]!=1 ){
            
            queue.offer(new ArrayList<>(List.of(row,col+1)));
            
        }


        }        


    }


}
