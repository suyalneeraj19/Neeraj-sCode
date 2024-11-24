class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int col = image[sr][sc];

        dfs(image, sr, sc, col, color);

        return image;
    }

    static void dfs(int [][] image , int row , int col, int val, int color){

        if(row < 0 || row > image.length-1 || col < 0 || col > image[0].length-1 || image[row][col] == color || image[row][col] != val  ){
            return;
        }

        image[row][col] = color;

        dfs(image, row-1, col , val, color);
        dfs(image, row+1, col , val, color);
        dfs(image, row, col-1 , val, color);
        dfs(image, row, col+1 , val, color);
    }
}