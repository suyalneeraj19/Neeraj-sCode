class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuffer sb=new StringBuffer();
        int count=0;
        for(char x:word.toCharArray()){
            if(x!=ch){
                sb.append(x);
            }else if(x==ch && count==0){
                sb.append(x);
                sb.reverse();
                count++;
            }else{
                sb.append(x);
            }
        }
        return sb.toString();
    }
}