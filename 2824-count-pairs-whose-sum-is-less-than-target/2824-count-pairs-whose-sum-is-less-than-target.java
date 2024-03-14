class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int s=0;
        int e=nums.size()-1;
        
        int count=0;
        
        while(s<=e){
            if(nums.get(s)+nums.get(e)<target){
                count+=e-s;
                s++;
            }else{
                e--;
            }
        }
        return count;
    }
}