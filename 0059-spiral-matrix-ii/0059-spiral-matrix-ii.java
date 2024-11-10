class Solution {
    public int[][] generateMatrix(int n) {
        
        if(n==1)    return new int [][]{{1}};

        int [][] mat=new int [n][n];

        int top=0;
        int bottom=mat.length-1;
        int left=0;
        int right=mat[0].length-1;

        int x=1;
        while(true){
            // from left to right
            for(int i=left;i<=right;i++){
                mat[top][i]=x++;
            }
            top++;
            if(left>right || top>bottom){
                break;
            }

            // from top to bottom
            for(int i=top;i<=bottom;i++){
                mat[i][right]=x++;
            }
            right--;
            if(left>right || top>bottom){
                break;
            }

            // from bottom right to bottom left

            for(int i=right;i>=left;i--){
                mat[bottom][i]=x++;
            }
            bottom--;
            if(left>right || top>bottom){
                break;
            }

            //  from bottom left to top
            for(int i=bottom;i>=top;i--){
                mat[i][left]=x++;
            }
            left++;
            if(left>right || top>bottom){
                break;
            }

        }

        return mat;

    }
}