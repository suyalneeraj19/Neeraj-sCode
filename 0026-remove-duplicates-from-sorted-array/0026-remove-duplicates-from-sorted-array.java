import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> ans = new LinkedHashSet<>();
        for (int num : nums) {
            ans.add(num);
        }

        int k = 0;
        for (int x : ans) {
            nums[k++] = x;
        }

        return ans.size();
    }
}
