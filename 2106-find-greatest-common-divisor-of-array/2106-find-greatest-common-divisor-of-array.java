class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num : nums){
            if(num < min) min = num;
            if(num > max) max = num;  
        }

        return gcd(min,max);
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }

        return gcd(b%a,a);
    }
    

}