class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
    int n = arr.length;
    List<List<Integer>> ans = new ArrayList<>();

    Arrays.sort(arr); // Sort the array to optimize the algorithm

    for (int k = 0; k < n - 2; k++) {
        if (k > 0 && arr[k] == arr[k - 1]) continue; // Skip duplicates

        int i = k + 1;
        int j = n - 1;

        while (i < j) {
            int sum = arr[k] + arr[i] + arr[j];
            if (sum == 0) {
                List<Integer> subans = new ArrayList<>();
                subans.add(arr[k]);
                subans.add(arr[i]);
                subans.add(arr[j]);
                ans.add(subans);

                while (i < j && arr[i] == arr[i + 1]) i++; // Skip duplicates
                while (i < j && arr[j] == arr[j - 1]) j--; // Skip duplicates

                i++;
                j--;
            } else if (sum < 0) {
                i++;
            } else {
                j--;
            }
        }
    }

    return ans;
}

}