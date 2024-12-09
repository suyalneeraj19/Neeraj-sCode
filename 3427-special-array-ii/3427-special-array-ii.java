class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = queries.length;
        boolean[] ans = new boolean[n];
        int[] converted = new int[nums.length];
        converted[0] = 0;

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] % 2) == (nums[i - 1] % 2)) {
                j++;
            }
            converted[i] = j;
        }

        for (int i = 0; i < n; i++) {
            ans[i] = (converted[queries[i][0]] == converted[queries[i][1]]) ? true : false;
        }

        return ans;
    }
}