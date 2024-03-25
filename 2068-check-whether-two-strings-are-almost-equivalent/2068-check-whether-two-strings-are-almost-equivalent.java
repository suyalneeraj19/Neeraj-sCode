class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
// create two arrays to create a charachter count for word1 and word2 
        int [] c1=new int[26];
        int [] c2=new int[26];
// traverse the string word1 and string word2  similarly and make a frequency countint those arrays
        
        for(int i=0;i<word1.length();i++){
            c1[word1.charAt(i)-97]++;
            c2[word2.charAt(i)-97]++;
        }
// if the count diffrence between two arrays is greater than 3       
        
        for(int i=0;i<26;i++){
            if(Math.abs(c1[i]-c2[i])>3) return false;
        }
        
        return true;
    }
}