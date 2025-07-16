import java.util.Scanner;

public class TicTacToe5x5 {
    static final int SIZE = 5;
    static char[][] board = new char[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initBoard();
        printBoard();

        char currentPlayer = 'X';
        while (true) {
            System.out.printf("玩家 %c 請輸入 row col (0-4): ", currentPlayer);
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (!isValidMove(row, col)) {
                System.out.println("該位置已有棋子，請重新輸入！");
                continue;
            }

            board[row][col] = currentPlayer;
            System.out.printf("玩家 %c 在位置 (%d, %d) 放置棋子\n", currentPlayer, row, col);
            printBoard();

            if (isWin(currentPlayer)) {
                System.out.printf("玩家 %c 獲勝！\n", currentPlayer);
                break;
            } else if (isDraw()) {
                System.out.println("平手！");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        sc.close();
    }

    static void initBoard() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = '.';
    }

    static void printBoard() {
        System.out.println("=== 5x5 井字遊戲 ===");
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isValidMove(int r, int c) {
        return r >= 0 && r < SIZE && c >= 0 && c < SIZE && board[r][c] == '.';
    }

    static boolean isWin(char player) {
        // check rows & columns
        for (int i = 0; i < SIZE; i++) {
            if (countConsecutive(board[i], player) >= 5) return true;
            char[] col = new char[SIZE];
            for (int j = 0; j < SIZE; j++) col[j] = board[j][i];
            if (countConsecutive(col, player) >= 5) return true;
        }

        // check diagonals
        for (int i = 0; i <= SIZE - 5; i++) {
            if (checkDiagonal(player, i, 0, 1, 1)) return true; // left-top to right-bottom
            if (checkDiagonal(player, 0, i, 1, 1)) return true;
            if (checkDiagonal(player, i, SIZE - 1, 1, -1)) return true; // right-top to left-bottom
            if (checkDiagonal(player, 0, SIZE - 1 - i, 1, -1)) return true;
        }

        return false;
    }

    static boolean checkDiagonal(char player, int startRow, int startCol, int dRow, int dCol) {
        int count = 0;
        while (startRow >= 0 && startRow < SIZE && startCol >= 0 && startCol < SIZE) {
            if (board[startRow][startCol] == player) {
                count++;
                if (count == 5) return true;
            } else {
                count = 0;
            }
            startRow += dRow;
            startCol += dCol;
        }
        return false;
    }

    static int countConsecutive(char[] arr, char player) {
        int count = 0, max = 0;
        for (char c : arr) {
            if (c == player) {
                count++;
                if (count == 5) return 5;
            } else {
                count = 0;
            }
        }
        return max;
    }

    static boolean isDraw() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (board[i][j] == '.')
                    return false;
        return true;
    }
}
