class Solution {
    public boolean isPalindrome(int x) {
        if(x <0 )   return false;

        return x==rev(x);
    }

    static int rev(int x){
        int digits=(int)(Math.log10(x))+1;
        return helper(x,digits);
    }

    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }

        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
}