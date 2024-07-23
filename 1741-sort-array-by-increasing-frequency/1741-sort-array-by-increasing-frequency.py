from collections import Counter

class Solution:
    def frequencySort(self, nums):
        frequency_map = Counter(nums)

        nums.sort(key=lambda x: (frequency_map[x], -x))

        return nums