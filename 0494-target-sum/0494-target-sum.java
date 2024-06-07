class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        return dp(nums, S, nums.length - 1, 0);
    }
    
    private int dp(int[] nums, int target, int index, int currSum) {
        // Base Cases
        if (index < 0 && currSum == target) {
            return 1;
        }
        if (index < 0) {
            return 0;
        }
        
        // Decisions
        int positive = dp(nums, target, index - 1, currSum + nums[index]);
        int negative = dp(nums, target, index - 1, currSum - nums[index]);
        
        return positive + negative;
    }
}