class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int []arr:accounts){
            int innerMax=0;
            for(int x:arr){
                innerMax+=x;
            }
            max=Math.max(max,innerMax);
        }
        return max;
    }
}