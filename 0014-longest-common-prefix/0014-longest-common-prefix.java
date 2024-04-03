class Solution {
    public String longestCommonPrefix(String[] s) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(s);

        String f=s[0];
        String l=s[s.length-1];
        for(int i=0;i<Math.min(f.length(),l.length());i++){
            if(f.charAt(i)!=l.charAt(i)){
                return sb.toString();
            }
            sb.append(f.charAt(i));
        }
        return sb.toString();
    }
}