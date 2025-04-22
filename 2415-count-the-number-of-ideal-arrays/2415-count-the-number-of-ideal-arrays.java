class Solution {
    int MOD = 1000000007;
    int[][] cnt = new int[10001][14];
    int[][] dp = new int[10001][14];

    public Solution() {
        for (int i = 0; i < 10001; i++){
            for (int j = 0; j <= Math.min(i, 13); j++){
                dp[i][j] = (j == 0 || j == i) ? 1 : (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
            }
        }
        for (int cur = 1; cur < 10001; cur++){
            cnt[cur][0]++;
            for (int i = cur * 2; i < 10001; i += cur){
                for (int bars = 0; bars < 13; bars++){
                    if (cnt[cur][bars] > 0){
                        cnt[i][bars + 1] = (cnt[i][bars + 1] + cnt[cur][bars]) % MOD;
                    }
                }
            }
        }
    }
    
    public int idealArrays(int n, int maxValue) {
        int res = 0;
        for (int i = 1; i <= maxValue; i++) {
            for (int bars = 0; bars < Math.min(14, n); bars++) {
                res = (res + (int)(1L * cnt[i][bars] * dp[n - 1][bars] % MOD)) % MOD;
            }
        }
        return res;
    }
}