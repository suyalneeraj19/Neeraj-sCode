#include <vector>
#include <algorithm>

class Solution {
public:
    int numberOfSubarrays(std::vector<int>& nums, int k) {
        int n = nums.size();
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

    int subarray(std::vector<int>& nums, int k) {
        if (k < 0) {
            return 0;
        }
        int n = nums.size();

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
};