class Solution:
    def numberOfSubarrays(self, nums, k):
        n = len(nums)
        l = 0
        r = 0
        odd = 0
        count = 0

        while r < n:
            if nums[r] % 2 != 0:
                odd += 1
            while odd > k:
                if nums[l] % 2 != 0:
                    odd -= 1
                l += 1
            count += r - l + 1
            r += 1
        return count - self.subarray(nums, k - 1)

    def subarray(self, nums, k):
        if k < 0:
            return 0
        n = len(nums)

        l = 0
        r = 0
        odd = 0
        count = 0

        while r < n:
            if nums[r] % 2 != 0:
                odd += 1
            while odd > k:
                if nums[l] % 2 != 0:
                    odd -= 1
                l += 1
            count += r - l + 1
            r += 1
        return count