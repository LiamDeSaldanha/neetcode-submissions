class Solution {
    public boolean isValidSudoku(char[][] board) {
        

        for (int i = 0; i < board.length; i++) {
            List<String> vert = new ArrayList<>();
            List<String> hori = new ArrayList<>();
            for (int j = 0; j < board.length; j++) {
                if (hori.contains(String.valueOf(board[i][j])) && board[i][j]!='.' ){
                    System.out.println("i j"+i+" "+j);
                    System.out.println();

                    return false;

                }
                if (vert.contains(String.valueOf(board[j][i]))&&board[j][i]!='.'){
                    System.out.println("i j"+i+" "+j);
                    return false;

                }
                hori.add(String.valueOf(board[i][j]));
                vert.add(String.valueOf(board[j][i]));
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                List<String> sub = new ArrayList<>();
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        

                        if (sub.contains(String.valueOf(board[j+(i*3)][k+(p*3)]))&&board[j+(i*3)][k+(p*3)]!='.')
                            return false;
                        sub.add(String.valueOf(board[j+(i*3)][k+(p*3)]));
                    }
                }
            }
        }
        return true;
    }
}
