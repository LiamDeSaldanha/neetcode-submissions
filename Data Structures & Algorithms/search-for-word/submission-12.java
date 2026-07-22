class Solution {
    char[][] board1;
    int[][] visited ;
    Set<String> set =new HashSet<>();
    public boolean exist(char[][] board, String word) {
        board1 = board;
        
        int position =0;
        for(int i=0;i<board.length;i++){
            for(int j =0; j<board[0].length;j++){
                if(board[i][j]==word.charAt(position)){
                    visited = new int[board1.length][board1[0].length];
                    set.add(word.substring(0,position+1));
                    
                    dfs(i,j,position+1,word);
                    
                    
                }
            }
        }
        System.out.println(set);
        return set.contains(word);
    }

    public void dfs(int i,int j,int position,String word){

        if(position==word.length()){
            return;
        }
        visited[i][j] =1;
        
        if(i!=0 && board1[i-1][j]==word.charAt(position) && visited[i-1][j]!=1){
            
            set.add(word.substring(0,position+1));
            dfs(i-1,j,1+position,word);
            visited[i-1][j]=0;
            
        }
        if(i!= board1.length-1 && board1[i+1][j]==word.charAt(position)&& visited[i+1][j]!=1){
            set.add(word.substring(0,position+1));

            dfs(i+1,j,1+position,word);
             visited[i+1][j]=0;

        }
        if(j!=0 && board1[i][j-1]==word.charAt(position)&& visited[i][j-1]!=1){
                       set.add(word.substring(0,position+1));


            dfs(i,j-1,position+1,word);
             visited[i][j-1]=0;

        }
        if(j!= board1[0].length-1 && board1[i][j+1]==word.charAt(position)&& visited[i][j+1]!=1){
            set.add(word.substring(0,position+1));
            
            dfs(i,j+1,1+position,word);
             visited[i][j+1]=0;

            
        }




    }


}
