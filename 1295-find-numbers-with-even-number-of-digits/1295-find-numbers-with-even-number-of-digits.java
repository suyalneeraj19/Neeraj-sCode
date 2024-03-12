class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int x:nums){
            if(even(x)){
                c++;
            }   
            }
         return c;
        }
    
     private static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

private static int digits(int num){
    if(num<0){
        num*=-1;
    }
    return (int)(Math.log10(num)) + 1;
    
}
}