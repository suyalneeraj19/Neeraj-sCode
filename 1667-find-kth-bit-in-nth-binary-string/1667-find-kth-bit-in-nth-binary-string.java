class Solution {
    public char findKthBit(int n, int k) {
        String p="";
        p=helper(n,p);

        return p.charAt(k-1);
    }

    private static String helper(int n,String p){
        if(n == 1){
            return  p+"0";
        }

        return helper(n-1,p) + "1" + reverse(invert(helper(n-1,p)));

    }

    static String invert(String p){
        StringBuffer sb = new StringBuffer();

        for(char ch:p.toCharArray()){
            if(ch=='0'){
                sb.append(1);
            }
            if(ch=='1'){
                sb.append(0);
            }
        }

        return sb.toString();
    }

    public static String reverse(String p) {
    StringBuilder sb = new StringBuilder(p);
    return sb.reverse().toString();
    }
}