class Solution {
    public int[] applyOperations(int[] nums) {
        
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i + 1]){
                nums[i]  =nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        moveZero(nums);
        return nums;
    }


    static void moveZero(int [] arr){
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;

                index++;
            }
        }
    }
}