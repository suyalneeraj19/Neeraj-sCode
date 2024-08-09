import java.util.BitSet;

class Solution {
    public static boolean isMagic(int i, int j, int[][] grid) {
        BitSet once = new BitSet(10); // BitSet to track digits 1-9
        int[] rowSum = new int[3];
        int[] colSum = new int[3];

        for (int a = i - 1; a <= i + 1; a++) {
            for (int b = j - 1; b <= j + 1; b++) {
                int x = grid[a][b];
                if (x < 1 || x > 9) return false; // invalid number for a magic square
                rowSum[a - i + 1] += x;
                colSum[b - j + 1] += x;
                once.set(x); // mark the number as seen
            }
        }
        
        // Check if numbers 1-9 are present exactly once
        if (once.cardinality() != 9) return false;

        // Check if all rows and columns sum to 15
        for (int sum : rowSum) {
            if (sum != 15) return false;
        }
        for (int sum : colSum) {
            if (sum != 15) return false;
        }

        // Check if diagonals sum to 15
        return (grid[i - 1][j - 1] + grid[i + 1][j + 1] == 10 &&
                grid[i + 1][j - 1] + grid[i - 1][j + 1] == 10);
    }

    public static int numMagicSquaresInside(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        if (r < 3 || c < 3) return 0;

        int cnt = 0;
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                if (grid[i][j] == 5) 
                    cnt += isMagic(i, j, grid) ? 1 : 0;
            }
        }
        return cnt;
    }
}