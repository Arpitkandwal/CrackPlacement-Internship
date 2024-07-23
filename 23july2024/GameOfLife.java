
public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = {{0,1,0}, {0,0,1}, {1,1,1}, {0,0,0}};
        gameOfLife(board);
    }

    public static void gameOfLife(int[][] board) {

        int[][] clone = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                clone[i][j] = board[i][j];
            }
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(clone[i][j] == 1) {
                    int live = findLive(i,j,clone);
                    if(live == 2 || live == 3) {
                        board[i][j] = 1;
                    }
                    else {
                        board[i][j] = 0;
                    }
                }
                else{
                    if(findLive(i,j,clone) == 3) {
                        board[i][j] = 1;
                    }
                    else {
                        board[i][j] = 0;
                    }
                }
            }
        }
    }

    private static int findLive(int i, int j, int[][] board) 
    {
        int live = 0;
        if(i+1 < board.length && board[i+1][j] == 1) live++;
        if(j+1 <board[0].length && board[i][j+1] == 1) live++;
        if(i-1 >= 0 && board[i-1][j] == 1) live++;
        if(j-1 >= 0 && board[i][j-1] == 1) live++;
        if(i+1 < board.length && j+1 < board[0].length &&  board[i+1][j+1] == 1) live++;
        if(i+1 < board.length && j-1 >= 0 && board[i+1][j-1] == 1) live++;
        if(i-1 >= 0 && j+1 < board[0].length && board[i-1][j+1] == 1) live++;
        if(i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 1) live++;
        return live;
    }
}
