class Solution {
    public long minimumSteps(String s) {
        long res = 0;
        int j = 0; // Initialize j outside the loop
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                res += i - (j++);
            }
        }
        return res;
    }
}