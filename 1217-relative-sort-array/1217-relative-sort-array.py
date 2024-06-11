class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        # Create a dictionary to store the frequency of each element in arr1
        freq = {}
        for num in arr1:
            if num in freq:
                freq[num] += 1
            else:
                freq[num] = 1

        # Initialize the result list
        result = []

        # Add elements from arr2 in the order they appear
        for num in arr2:
            if num in freq:
                result.extend([num] * freq[num])
                del freq[num]

        # Add remaining elements from arr1 in ascending order
        for num in sorted(freq.keys()):
            result.extend([num] * freq[num])

        return result