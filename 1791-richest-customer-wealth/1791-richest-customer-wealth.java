class Solution {
     int max=0;
    public int maximumWealth(int[][] accounts) {
       for(int i=0;i<accounts.length;i++){
        int sum=0;
        for(int j=0;j<accounts[i].length;j++){
            sum+=accounts[i][j];
        }
        max=Math.max(sum,max);
       }
       return max;
       
    }
}