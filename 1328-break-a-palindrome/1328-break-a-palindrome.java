class Solution {
    public String breakPalindrome(String pal) {
        // to make a check if pallindrome string is empty then return "" string
        if(pal==null || pal.length()<2) return "";
        
        // create a charchter array of pallindrome string and then traverse it till the mid length and if the charachter at arr[i]!='a' make it 'a'
        char [] s=pal.toCharArray();
        
        for(int i=0;i<s.length/2;i++){
            if(s[i]!='a'){
                s[i]='a';
                return new String(s);
            }
        }
        
       // in case all the charchter are 'a' in the palindrome string then the ans will be incorrect so we are gonna add an extra charachter 'b' at then end so string doesn't remians pallindrome
        s[s.length-1]='b';
        
        return new String(s);
    }
}