class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int s = 0, e = n - 1;
        int maxArea = 0;

        while (s < e) {
            int h = Math.min(height[s], height[e]);
            maxArea = Math.max(maxArea, h * (e - s));

            if (height[s] < height[e]) {
                s++;
            } else {
                e--;
            }
        }

        return maxArea;
    }
}