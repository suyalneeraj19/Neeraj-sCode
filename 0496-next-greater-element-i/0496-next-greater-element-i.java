class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> ans = new Stack<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int x = nums2[i];
            while (!ans.isEmpty() && ans.peek() <= x) {
                ans.pop();
            }
            if (ans.isEmpty())
                m.put(x, -1);
            else
                m.put(x, ans.peek());

            ans.push(x);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = m.containsKey(nums1[i]) ? m.get(nums1[i]) : -1;
        }

        return nums1;
    }
}