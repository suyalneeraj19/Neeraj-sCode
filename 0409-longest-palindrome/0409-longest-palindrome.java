class Solution {
    public int longestPalindrome(String s) {
        int res = 0, val = 0;
        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                res += entry.getValue() - 1;
                val = 1;
            } else {
                res += entry.getValue();
            }
        }
        return res + val;
    }
}