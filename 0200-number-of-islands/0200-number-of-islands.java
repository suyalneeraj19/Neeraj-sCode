class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0 || grid==null) return 0;
        
        int count=0;
        
        for(int row=0;row<grid.length;row++){
            for(int col =0;col<grid[0].length;col++){
                if(grid[row][col]=='1'){
                    count+=helper(grid,row,col);
                    
                }
            }
        }
        return count;
    }
    
    private static int helper(char [][] grid,int row,int col){
        if(row <0 || row>=grid.length || col<0||col >=grid[0].length|| grid[row][col]!='1') return 0;
        
        grid[row][col]='0';
        helper(grid,row+1,col);
        helper(grid,row-1,col);
        helper(grid,row,col+1);
        helper(grid,row,col-1);
        
        return 1;
        
    }
}