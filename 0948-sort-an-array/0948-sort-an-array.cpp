class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
        mergeSort(nums, 0, nums.size());
        return nums;
    }

private:
    void mergeSort(vector<int>& arr, int s, int e) {
        if (e - s <= 1) {
            return;
        }

        int m = s + (e - s) / 2;

        mergeSort(arr, s, m);
        mergeSort(arr, m, e);

        merge(arr, s, m, e);
    }

    void merge(vector<int>& arr, int s, int m, int e) {
        int i = s, j = m, k = 0;
        vector<int> mix(e - s);

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i < m) {
            mix[k++] = arr[i++];
        }
        while (j < e) {
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.size(); l++) {
            arr[s + l] = mix[l];
        }
    }
};