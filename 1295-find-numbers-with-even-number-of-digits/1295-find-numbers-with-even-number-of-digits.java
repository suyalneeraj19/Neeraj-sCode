class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int x:nums){
            if(!isOdd(x)){
                c++;
            }   
            }
         return c;
        }
    
     private static boolean isOdd(int n) {
         int nod=digits(n);
        return (nod & 1) == 1;
    }

private static int digits(int num){
    if(num<0){
        num*=-1;
    }
    return (int)(Math.log10(num)) + 1;
    
}
}