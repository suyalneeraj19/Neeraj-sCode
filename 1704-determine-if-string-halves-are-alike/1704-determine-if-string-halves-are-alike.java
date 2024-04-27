class Solution {
    public boolean halvesAreAlike(String s) {
        int len=s.length()/2;
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(i<len){
                sb1.append(s.charAt(i));
            }else{
                sb2.append(s.charAt(i));
            }
        }
        
        int c1=count(sb1.toString());
        int c2=count(sb2.toString());
        
        return c1==c2;
    }
    
    private static int count(String s){
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                c++;
            }
        }
        return c;
    }
}