class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=words.length;
        Set<Character> ans=new HashSet<>();

        for(char x:allowed.toCharArray()){
            ans.add(x);
        }

        for(String word:words){
            for(char ch:word.toCharArray()){
                if(!ans.contains(ch)){
                    count--;
                    break;
                }
            }
        }

        return count;
    }
}