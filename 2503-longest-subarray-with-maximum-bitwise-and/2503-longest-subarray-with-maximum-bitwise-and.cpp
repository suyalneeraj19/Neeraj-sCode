class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int maximum = 0, ans = 1, count = 0;
        
        // Find the maximum element
        for(int num : nums) {
            maximum = max(maximum, num);
        }
        
        // Count the longest subarray of maximum element
        for(int num : nums) {
            if(num == maximum) {
                ans = max(ans, ++count);
            } else {
                count = 0;
            }
        }
        
        return ans;
    }
};
