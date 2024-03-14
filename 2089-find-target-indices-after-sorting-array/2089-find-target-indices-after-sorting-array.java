class Solution {
   public List<Integer> targetIndices(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        List<Integer> ans = new ArrayList<>();
        quicksort(nums,0,nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                ans.add(i);
        }
        return ans;

    }

    private static void quicksort(int[] arr, int low, int hi) {
        if (low >= hi)
            return;

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                swap(arr, s, e);
                s++;
                e--;
            }
        }
        quicksort(arr, s, hi);
        quicksort(arr, low, e);
    }

    static void swap(int[] arr, int f, int s) {
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
    
}