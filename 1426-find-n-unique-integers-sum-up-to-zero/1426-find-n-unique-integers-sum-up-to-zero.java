class Solution {
    public int[] sumZero(int n) {
        int [] ans= new int [n];

        for(int i=0;i<n;i++){
            ans[i]=2*i-n+1;
        }

        return ans;
    }
}