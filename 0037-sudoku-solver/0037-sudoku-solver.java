class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    static boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        // Find an empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) break;
        }

        // No empty cells left, puzzle solved
        if (emptyLeft) return true;

        // Backtracking
        for (char number = '1'; number <= '9'; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number; // Place number
                if (solve(board)) return true; // Found solution
                board[row][col] = '.'; // Backtrack
            }
        }
        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {
        for (int i = 0; i < board.length; i++) {
            // Check row and column simultaneously
            if (board[row][i] == num || board[i][col] == num) return false;
        }

        // Check the 3x3 subgrid
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) return false;
            }
        }
        
        return true;
    }
}