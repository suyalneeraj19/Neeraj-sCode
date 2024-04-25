class Solution {
    public int longestIdealString(String s, int k) {
        int [] seq=new int[26];
        int ans=0;
        for(char ch:s.toCharArray()){
            int i=ch-'a';
            int j0=Math.max(0,i-k);
            int j1=Math.min(i+k,25);
            for(int j=j0;j<=j1;j++){
                seq[i]=Math.max(seq[i],seq[j]);
            }
            seq[i]++;
            ans=Math.max(ans,seq[i]);
        }
        return ans;
    }
}