class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        freq1 = {}
        freq2 = {}

        # Count the frequency of elements in nums1
        for num in nums1:
            freq1[num] = freq1.get(num, 0) + 1

        # Check if elements in nums2 are present in nums1 and add them to the result
        result = []
        for num in nums2:
            if num in freq1 and freq1[num] > 0:
                result.append(num)
                freq1[num] -= 1

        return result