class Solution {
    void check(vector<vector<int>>& grid, int i, int j, int n, int m, vector<vector<bool>>& visited) {
        // Guard logic only applies if the current cell has a guard
        if (grid[i][j] != 1) return;

        // left
        for (int k = j - 1; k >= 0; k--) {
            if (grid[i][k] == 2 || grid[i][k] == 1) break;
            visited[i][k] = true;
        }
        // right
        for (int k = j + 1; k < m; k++) {
            if (grid[i][k] == 2 || grid[i][k] == 1) break;
            visited[i][k] = true;
        }
        // up
        for (int k = i - 1; k >= 0; k--) {
            if (grid[k][j] == 2 || grid[k][j] == 1) break;
            visited[k][j] = true;
        }
        // down
        for (int k = i + 1; k < n; k++) {
            if (grid[k][j] == 2 || grid[k][j] == 1) break;
            visited[k][j] = true;
        }
    }

public:
    int countUnguarded(int n, int m, vector<vector<int>>& guards, vector<vector<int>>& walls) {
        // guard = 1, wall = 2
        vector<vector<int>> v(n, vector<int>(m, 0));

        // Fill the grid with guards and walls
        for (auto temp : guards) {
            int i = temp[0];
            int j = temp[1];
            v[i][j] = 1;
        }
        for (auto temp : walls) {
            int i = temp[0];
            int j = temp[1];
            v[i][j] = 2;
        }

        vector<vector<bool>> visited(n, vector<bool>(m, false));

        // Check visibility from each guard
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                check(v, i, j, n, m, visited);
            }
        }

        // Count unguarded cells
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (v[i][j] == 0 && !visited[i][j]) count++;
            }
        }

        return count;
    }
};