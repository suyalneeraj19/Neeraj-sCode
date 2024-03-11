class Solution {
    public int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                return m;
            } else if (target < arr[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        return -1;
    }
}