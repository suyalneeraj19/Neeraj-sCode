class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuffer sb = new StringBuffer();

        int prev = 0;
        for(int i = 0; i< spaces.length; i++){
            sb.append(s.substring(prev , spaces[i])).append(" ");
            prev = spaces[i];
        }

        sb.append(s.substring(prev , s.length()));

        return sb.toString();
    }
}