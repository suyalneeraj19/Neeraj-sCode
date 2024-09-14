class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        maximum = max(nums)  
        ans = 1
        count = 0
        
        for num in nums:
            if num == maximum:
                count += 1
                ans = max(ans, count)
            else:
                count = 0
                
        return ans
