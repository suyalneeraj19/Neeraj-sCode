#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    void heapify(vector<int>& nums, int i, int n) {
        int largest = i; // Change smallest to largest for max-heap
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && nums[left] > nums[largest]) {
            largest = left;
        }
        if (right < n && nums[right] > nums[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(nums[largest], nums[i]);
            heapify(nums, largest, n);
        }
    }

    vector<int> sortArray(vector<int>& nums) {
        int n = nums.size();
        // Build max heap
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(nums, i, n);
        }
        // Extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            swap(nums[0], nums[i]); // Move current root to end
            heapify(nums, 0, i); // Heapify the reduced heap
        }
        return nums;
    }
};