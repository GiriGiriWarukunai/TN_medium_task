import java.util.ArrayList;

public class BoardSolution {
    private static final int N = 9;

    private boolean isValidSize(char[][] board){
        if (board.length != N) {
            return false;
        }
        for(char[] row : board) {
            if(row.length != N) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidCell(char x) {
        return (x >= '1' && x <= '9') || (x == '.');
    }

    private boolean isValidRow(char[] row) {
        ArrayList<Character> elems = new ArrayList<>();
        for (char x: row) {
            if(x != '.'){
                if(!elems.contains(x) && isValidCell(x)){
                    elems.add(x);
                }
                else{
                    return false;
                }
            }
        }
        return !elems.isEmpty();
    }

    private boolean isValidColumn(char[][] board, int column) {
        ArrayList<Character> elems = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            char x = board[i][column];
            if (x != '.') {
                if (!elems.contains(x) && isValidCell(x)) {
                    elems.add(x);
                } else {
                    return false;
                }
            }
        }
        return !elems.isEmpty();
    }


    public boolean isValidBoard(char[][] board) {
        if(!isValidSize(board)){
            return false;
        }
        for (char[] row : board) {
            if (!isValidRow(row)) {
                return false;
            }
        }
        for (int i = 0; i < N; i++) {
            if (!isValidColumn(board, i)) {
                return false;
            }
        }
        return true;
    }

}
