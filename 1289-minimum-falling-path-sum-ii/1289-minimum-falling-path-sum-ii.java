class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][3]; 
        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE/2);
        }
        
        for(int i = 0; i < n; i++) {
            int min = Math.min(dp[0][0], grid[0][i]);
            if(min == grid[0][i]) {
                dp[0][2] = i;
                dp[0][1] = dp[0][0];
                dp[0][0] = min;
            } else {
                dp[0][1] = Math.min(dp[0][1], grid[0][i]);
            }
        }

        for(int i = 1; i < n; i++) {      
            for(int j = 0; j < n; j++) {
                int min = Integer.MAX_VALUE;
                if(j == dp[i-1][2]) {
                    min = dp[i-1][1] + grid[i][j];
                } else {
                    min = dp[i-1][0] + grid[i][j];
                }
                if(min < dp[i][0]) {
                    dp[i][1] = dp[i][0];
                    dp[i][0] = min;
                    dp[i][2] = j;
                } else if(min < dp[i][1]) {
                    dp[i][1] = min;
                }
            }
        }
        return dp[n-1][0];
    }
}