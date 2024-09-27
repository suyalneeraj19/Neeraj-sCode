class Solution {
    public int lengthOfLastWord(String s) {
        String [] res=s.split(" ");
        int n= res.length;
        return res[n-1].length();
    }
}