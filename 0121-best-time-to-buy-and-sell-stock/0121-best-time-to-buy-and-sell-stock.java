class Solution {
    public int maxProfit(int[] P) {
        int bought = P[0] , profit = 0;

        for(int i = 1 ; i < P.length ; i++){
            if(P[i] < bought){
                bought = P[i];
            }
            if(P[i] > bought){
                profit = Math.max(profit , (P[i] - bought));
            }

        }

        return profit;

    }
}