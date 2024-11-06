class Solution {
    public boolean canSortArray(int[] nums) {
        boolean swapped;

        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    if (Integer.bitCount(nums[j - 1]) == Integer.bitCount(nums[j])) {
                        swap(nums, j - 1, j);
                        swapped = true;
                    } else {
                        return false;
                    }
                }
            }

            if (!swapped) {
                break;
            }
        }
        return true;
    }

    private static void swap(int[] arr, int f, int s) {
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}