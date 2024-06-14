class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int nextUnique = 0;
        int totalIncrement = 0;

        for (int num : nums) {
            nextUnique = Math.max(nextUnique, num);
            totalIncrement += nextUnique - num;
            nextUnique++;
        }
        return totalIncrement;
    }
}