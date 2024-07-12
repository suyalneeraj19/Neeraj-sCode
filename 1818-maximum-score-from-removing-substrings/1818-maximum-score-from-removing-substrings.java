class Solution {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder(s);
        if (x > y) {
            return remove(sb, "ab", x) + remove(sb, "ba", y);
        }
        return remove(sb, "ba", y) + remove(sb, "ab", x);
    }
    
    private int remove(StringBuilder sb, String pattern, int point) {
        int i = 0, res = 0;
        for (int j = 0; j < sb.length(); j++) {
            sb.setCharAt(i++, sb.charAt(j));
            if (i > 1 && sb.charAt(i-2) == pattern.charAt(0) && sb.charAt(i-1) == pattern.charAt(1)) {
                i -= 2;
                res += point;
            }
        }
        sb.setLength(i);
        return res;
    }
}