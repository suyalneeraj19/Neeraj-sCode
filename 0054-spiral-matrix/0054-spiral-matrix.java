class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new ArrayList<>();
        }

        int m = matrix.length, n = matrix[0].length;

        boolean visited[][] = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };

        int r = 0, c = 0, di = 0;

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m * n; i++) {
            res.add(matrix[r][c]);

            visited[r][c] = true;

            int cr = r + dr[di];
            int cc = c + dc[di];

            if (isSafe(visited, cr, cc)) {
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }

        }
        return res;
    }

    boolean isSafe(boolean [] [] visited ,int r,int c){
        return (r>=0 && r<visited.length && c>=0 && c<visited[0].length && !visited[r][c]);
    }
}