import java.util.Arrays;

class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        int[] seen = new int[n + 2];
        long res = 0;

        int[][] indexedNums = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexedNums[i][0] = nums[i];
            indexedNums[i][1] = i + 1;
        }

        Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] pair : indexedNums) {
            int value = pair[0];
            int index = pair[1];

            if (seen[index] == 0) {
                res += value;
                seen[index] = 1;
                seen[index - 1] = 1;
                seen[index + 1] = 1;
            }
        }

        return res;
    }
}
