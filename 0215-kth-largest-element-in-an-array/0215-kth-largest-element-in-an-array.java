class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for (int x : nums) {
            que.add(x);
            if (que.size() > k) {
                que.poll();
            }
        }

        return que.peek();
    }
}