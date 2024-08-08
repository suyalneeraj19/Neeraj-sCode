class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] matrix = new int[rows * cols][2];
        int k = 0;

        // Define the directions for moving right, down, left, and up
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0; // Start moving right
        int steps = 1; // Initial steps in the current direction

        // Start filling the matrix
        while (k < matrix.length) {
            for (int i = 0; i < steps; i++) {
                // Check if the current position is valid
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    matrix[k][0] = rStart;
                    matrix[k][1] = cStart;
                    k++;
                }
                // Move in the current direction
                rStart += directions[dir][0];
                cStart += directions[dir][1];
            }
            // Change direction
            dir = (dir + 1) % 4;
            // After every two directions, increase the steps
            if (dir % 2 == 0) {
                steps++;
            }
        }
        return matrix;
    }
}