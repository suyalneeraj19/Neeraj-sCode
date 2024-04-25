class Solution {
    public boolean canReach(String st, int minJump, int maxJump) {
        if(st==null || st.length()==0) return false;
        int n=st.length();
        if(st.charAt(0)=='1' || st.charAt(n-1)=='1') return false;

        boolean [] dp=new boolean[st.length()];

        dp[0]=true;

        int s=0;
        int e=0;
        for(int i=0;i<n;i++){
            if(!dp[i])  continue;

            s=Math.max(e+1,i+minJump);
            e=Math.min(n-1,i+maxJump);

            for(int j=s;j<=e;j++){
                if(st.charAt(j)=='0'){
                    dp[j]=true;
                }
            }

            if(dp[n-1]) return true;
        }
        return dp[n-1];
    }
}