class Solution {
    public int countNegatives(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        int s=0;
        int e=grid[0].length-1;
        int c=0;

        while(s<rows && e>=0){
            if(grid[s][e]>=0){
                s++;
            }else{
                c+=rows-s;
                e--;
            }
        }
        return c;
    }
}