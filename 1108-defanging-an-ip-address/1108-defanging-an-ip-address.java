class Solution {
    public String defangIPaddr(String address) {
        StringBuffer sb=new StringBuffer();
        for(char ch:address.toCharArray()){
            if(ch!='.'){
                sb.append(ch);
            }else{
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}