class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        Arrays.sort(arr2);
        for (int x : arr1) {
            if (!bs(arr2, x - d, x + d))
                res++;
        }
        return res;
    }

    public static boolean bs(int[] arr, int r1, int r2) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] >= r1 && arr[m] <= r2)
                return true;
            else if (arr[m] < r1)
                s = m + 1;
            else
                e = m - 1;
        }
        return false;
    }
}