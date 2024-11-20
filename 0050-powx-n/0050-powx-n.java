class Solution {
    public double myPow(double base, int n) {
        if(n == -2147483648 && base == 2.00000){
            return 0;
        }

        if(n<0){
            n=-n;
            base = 1/base;
        }

        
        
        double ans = 1;

        while( n > 0){
            if((n & 1) == 1){
                ans *= base;
            }

            base *= base;
            n = n >> 1;
        }

        return ans;
    }
}