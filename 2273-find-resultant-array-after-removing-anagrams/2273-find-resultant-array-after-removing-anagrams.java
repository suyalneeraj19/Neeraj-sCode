class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
        String prev="";
        for(int i=0;i<words.length;i++){
            char [] ch=words[i].toCharArray();
            Arrays.sort(ch);
            String curr=String.valueOf(ch);
            if(!prev.equals(curr)){
                ans.add(words[i]);
                prev=curr;
            }
        }
        return ans;
    }
}