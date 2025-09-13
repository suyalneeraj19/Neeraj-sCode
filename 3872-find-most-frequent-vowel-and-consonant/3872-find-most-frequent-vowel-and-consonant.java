class Solution {
    public int maxFreqSum(String s) {
        int [] freq = new int [26];

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        int vow = 0 , con = 0;
        for(int i = 0 ; i < 26 ; i++ ){
            char ch = (char)(i + 'a');
            if(isVowel(ch)){
                vow = Math.max(vow , freq[i]);
            }else{
                con = Math.max(con , freq[i]);
            }
        }

        return (vow + con);
    }

    static boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? true : false;
    }
}