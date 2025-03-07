class Solution {
    public String stringHash(String s, int k) {
        int n = s.length();
        if(k == 1){
            return s;
        }
        
        StringBuffer sb = new StringBuffer();

        int prev = 0;
        for(int i = 0; i < n ; i+=k){
            sb.append(hash(s.substring(prev,i+k)));
            prev = i+k;
        }

        return sb.toString();
    }

    static char hash(String hash){
        char [] words = hash.toCharArray();
        int nextHash = 0;
        for(char ch : words){
            nextHash += (ch - 'a');
        }

        return (char)( (nextHash% 26) + 'a');
    }
}