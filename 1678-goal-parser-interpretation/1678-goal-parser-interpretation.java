class Solution {
    public String interpret(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('&& s.charAt(i+1)==')'){
                sb.append('o');
            }else if(s.charAt(i)=='(' && s.charAt(i+3)==')'){
                sb.append("al");
            }else if(s.charAt(i)=='G'){
                sb.append('G');
            }
    }
        return sb.toString();
    }
}