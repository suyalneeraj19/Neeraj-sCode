class Solution {
    public int compareVersion(String s1, String s2) {
        String[] v1 = s1.split("\\.");
        String[] v2 = s2.split("\\.");

        int maxLength = Math.max(v1.length, v2.length);

        for (int i = 0; i < maxLength; i++) {
            int val1 = (i < v1.length) ? Integer.parseInt(v1[i]) : 0;
            int val2 = (i < v2.length) ? Integer.parseInt(v2[i]) : 0;

            if (val1 < val2) {
                return -1;
            } else if (val1 > val2) {
                return 1;
            }
        }
        return 0;
    }
}