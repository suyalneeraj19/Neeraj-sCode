class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,target,0);
    }

    static int helper(int [] arr,int t,int index){
        // if(arr[0]==t)   return 0;
        if(index==arr.length) return -1;

        if(arr[index]==t)  return index;

        return helper(arr,t,index+1);
    }
}