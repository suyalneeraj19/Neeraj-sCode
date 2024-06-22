public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0, odd = 0, count = 0;

        while (r < n) {
            if (nums[r] % 2 != 0) {
                odd++;
            }
            while (odd > k) {
                if (nums[l] % 2 != 0) {
                    odd--;
                }
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count - subarray(nums, k - 1);
    }

    public int subarray(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        int n = nums.length;

        int l = 0, r = 0, odd = 0, count = 0;

        while (r < n) {
            if (nums[r] % 2 != 0) {
                odd++;
            }
            while (odd > k) {
                if (nums[l] % 2 != 0) {
                    odd--;
                }
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }
}