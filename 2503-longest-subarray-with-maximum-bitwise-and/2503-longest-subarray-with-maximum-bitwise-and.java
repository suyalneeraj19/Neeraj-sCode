class Solution {
    public int longestSubarray(int[] nums) {
        int maximum=0,ans=1,count=0;
        for(int num:nums){
            maximum=Math.max(maximum,num);
        }

        for(int num:nums){
            if(num==maximum){
                ans=Math.max(ans,++count);
            }else{
                count=0;
            }
        }

        return ans;
    }
}