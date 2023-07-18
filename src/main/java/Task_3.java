import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите матрицу размером 9x9:");
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[9][9];
        for (int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                board[i][j] = scanner.next().charAt(0);
            }
        }


        BoardSolution boardSolution = new BoardSolution();
        if (boardSolution.isValidBoard(board)) {
            System.out.println("Матрица валидна");
        } else {
            System.out.println("Матрица не валидна");
        }
    }
}
