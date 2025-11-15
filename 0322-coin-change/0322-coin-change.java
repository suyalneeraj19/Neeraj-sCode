class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int [][] dp = new int[n][amount + 1];

        int ans = f(coins , amount , n - 1 , dp);

        return (ans >= (int)1e9) ? -1 : ans;
    }

    static int f(int [] A , int t , int ind , int [][] dp){

        if(ind == 0){
            return (  t % A[0] == 0) ?  t / A[0] : (int)1e9;
        }

        if(dp[ind][t] != 0) return dp[ind][t];

        int notTake = f(A , t , ind -1 , dp);

        int take = Integer.MAX_VALUE;

        if(A[ind] <= t){
            take = 1 + f(A ,t - A[ind] , ind , dp);
        }

        return dp[ind][t] = Math.min(take , notTake);
    }
}