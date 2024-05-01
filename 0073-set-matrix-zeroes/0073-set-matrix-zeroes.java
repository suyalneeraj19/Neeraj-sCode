class Solution {
    public void setZeroes(int[][] matrix) {
        LinkedList<int[]> zerosList = new LinkedList<>();

        // Traverse the matrix to find zeros and store their coordinates in the linked list
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    zerosList.add(new int[]{row, col});
                }
            }
        }

        // Set zeros in the matrix based on the coordinates stored in the linked list
        for (int[] zero : zerosList) {
            int zeroRow = zero[0];
            int zeroCol = zero[1];

            // Set zeros in the row
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[zeroRow][col] = 0;
            }

            // Set zeros in the column
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][zeroCol] = 0;
            }
        }
    }
}