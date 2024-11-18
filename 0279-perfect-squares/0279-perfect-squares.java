class Solution {
    int [] arr = new int [10001];
    public int numSquares(int n) {
        if(n == 0){
            return 0;
        }

        if(arr[n] != 0){
            return arr[n];
        }

        int curr = Integer.MAX_VALUE;

        for(int i = 1 ; i * i <= n ;i++){

            int res = 1 + numSquares(n - i*i);

            curr = Math.min(curr,res);
        }

        return arr[n]=curr;
    }
}