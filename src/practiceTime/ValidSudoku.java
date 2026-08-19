package practiceTime;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {

        Test test = new Test();

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},

                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},

                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        boolean result = test.isValidSudoku(board);

        System.out.println(result); // true
    }
}

class Test {
    public boolean isValidSudoku(char[][] board) {

        // Row check
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;

                if (set.contains(board[i][j])) return false;

                set.add(board[i][j]);
            }
        }

        // Column check
        for (int j = 0; j < 9; j++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') continue;

                if (set.contains(board[i][j])) return false;

                set.add(board[i][j]);
            }
        }

        // 3x3 box check
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] == '.') continue;

                        if (set.contains(board[i][j])) return false;

                        set.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}