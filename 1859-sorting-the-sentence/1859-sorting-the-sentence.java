class Solution {
    public String sortSentence(String s) {
        String [] words=s.split(" ");
        Map<Integer,String> ans=new TreeMap<>();
        
        for(String word:words){
            int len=word.length();
            int num=Character.getNumericValue(word.charAt(len-1));
            String actualWord=word.substring(0,len-1);
            ans.put(num,actualWord);
        }
        
        StringBuffer sb=new StringBuffer();
        for(Map.Entry<Integer,String> x:ans.entrySet()){
            sb.append(x.getValue()).append(" ");
        }
        return sb.toString().trim();
    }
}