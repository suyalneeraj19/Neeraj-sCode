class Solution {
    public String mergeAlternately(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        StringBuffer sb = new StringBuffer();
        int i = 0, j = 0;
        
        while (i < m && j < n) {
            sb.append(s1.charAt(i++));
            if (j < n) {
                sb.append(s2.charAt(j++));
            }
        }
        
        while (i < m) {
            sb.append(s1.charAt(i++));
        }
        
        while (j < n) {
            sb.append(s2.charAt(j++));
        }
        
        return sb.toString();
    }
}
