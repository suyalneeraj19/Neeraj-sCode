class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0;
        for(int x:nums){
            ans^=x;
        }
        int count=0;
        while(k>0 || ans>0){
            if((k%2)!=(ans%2)){
                count++;
            }

            k/=2;
            ans/=2;
        }
        return count;
    }
}