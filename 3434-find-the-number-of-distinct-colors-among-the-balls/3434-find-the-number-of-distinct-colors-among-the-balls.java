import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> bc = new HashMap<>();
        Map<Integer, Integer> cf = new HashMap<>();
        Set<Integer> cs = new HashSet<>();
        int n = queries.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            if (bc.containsKey(ball)) {
                int prevColor = bc.get(ball);
                if (prevColor == color) {
                    res[i] = cs.size();
                    continue;
                }
                cf.put(prevColor, cf.get(prevColor) - 1);
                if (cf.get(prevColor) == 0) {
                    cs.remove(prevColor);
                }
            }

            bc.put(ball, color);
            cf.put(color, cf.getOrDefault(color, 0) + 1);
            cs.add(color);
            res[i] = cs.size();
        }

        return res;
    }
}
