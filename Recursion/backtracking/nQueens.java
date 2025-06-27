package backtracking;

import java.util.ArrayList;
import java.util.List;

public class nQueens {
    class Solution {
        public boolean safe(int row, int col, char[][] board) {
            // Check horizontal (left side only since we place queens column by column)
            for (int j = 0; j < col; j++) {
                if (board[row][j] == 'Q') {
                    return false;
                }
            }

            // Check upper diagonal (left side)
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }

            // Check lower diagonal (left side)
            for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }

            return true;
        }

        public void saveBoard(char[][] board, List<List<String>> allBoards) {
            List<String> newBoard = new ArrayList<>();

            for (int i = 0; i < board.length; i++) {
                String row = "";
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 'Q') {
                        row += 'Q';
                    } else {
                        row += '.';
                    }
                }
                newBoard.add(row);
            }
            allBoards.add(newBoard);
        }

        public void helper(char[][] board, List<List<String>> allBoards, int col) {
            if (col == board.length) {
                saveBoard(board, allBoards);
                return;
            }

            for (int row = 0; row < board.length; row++) {
                if (safe(row, col, board)) {
                    board[row][col] = 'Q';
                    helper(board, allBoards, col + 1);
                    board[row][col] = '.';
                }
            }
        }

        public List<List<String>> solveNQueens(int n) {
            List<List<String>> allBoards = new ArrayList<>();
            char[][] board = new char[n][n];

            // Initialize board with '.'
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = '.';
                }
            }

            helper(board, allBoards, 0);
            return allBoards;
        }
    }

    // Test method
    public static void main(String[] args) {
        nQueens nq = new nQueens();
        Solution solution = nq.new Solution();

        List<List<String>> result = solution.solveNQueens(4);

        System.out.println("Number of solutions for 4-Queens: " + result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Solution " + (i + 1) + ":");
            for (String row : result.get(i)) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}