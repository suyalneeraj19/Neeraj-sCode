class Solution {
    public int findMin(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;

            // If the right side is sorted
            if (arr[m] < arr[e]) {
                e = m; // The minimum is in the left part
            } else {
                s = m + 1; // The minimum is in the right part
            }
        }

        return arr[s]; // At the end, s and e converge to the minimum element
    }
}