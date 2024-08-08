class Solution {
public:
    vector<vector<int>> spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        vector<vector<int>> matrix(rows * cols, vector<int>(2));
        int k = 0;
        int directions[4][2] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;
        int steps = 1;

        while (k < matrix.size()) {
            for (int i = 0; i < steps; i++) {
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    matrix[k][0] = rStart;
                    matrix[k][1] = cStart;
                    k++;
                }
                rStart += directions[dir][0];
                cStart += directions[dir][1];
            }
            dir = (dir + 1) % 4;
            if (dir % 2 == 0) {
                steps++;
            }
        }
        return matrix;
    }
};