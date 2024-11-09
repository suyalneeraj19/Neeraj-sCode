class Solution {
    private List<List<Integer>> list;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(new ArrayList<>(), nums, target, 0);
        return list;
    }

    private void backtrack(List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain < 0) return;
        else if (remain == 0) {
            list.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(tempList, nums, remain - nums[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }
}