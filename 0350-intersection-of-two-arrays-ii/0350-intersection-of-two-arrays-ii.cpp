class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int, int> freq1, freq2;
        vector<int> result;

        // Count the frequency of elements in nums1
        for (int num : nums1) {
            freq1[num]++;
        }

        // Check if elements in nums2 are present in nums1 and add them to the result
        for (int num : nums2) {
            if (freq1[num] > 0) {
                result.push_back(num);
                freq1[num]--;
            }
        }

        return result;
    }
};