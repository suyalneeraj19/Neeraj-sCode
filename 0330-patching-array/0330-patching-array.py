class Solution:
    def minPatches(self, nums: List[int], n: int) -> int:
        patch = 0
        count = 0
        index = 0
        while patch < n:
            if index < len(nums) and patch + 1 >= nums[index]:
                patch += nums[index]
                index += 1
            else:
                patch += (patch + 1)
                count += 1
        return count