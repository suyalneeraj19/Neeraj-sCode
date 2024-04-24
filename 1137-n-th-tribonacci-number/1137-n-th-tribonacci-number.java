class Solution {
//     dynamically allocat the memory for statring
    private static int [] dp=new int[40];
    
    
    public int tribonacci(int n) {
//     fill the array with -1 so that we can use it later in the helper function call
        Arrays.fill(dp,-1);
        return helper(n);
    }
    
    private static int helper(int n){
//         set base conditions
        if(n==0)    return 0;
        if(n==1 || n==2)    return 1;
        
//         check if value is stored in the array or not
        if(dp[n]!=-1) return dp[n];
        
        return dp[n]=helper(n-1)+helper(n-2)+helper(n-3);
    }
}