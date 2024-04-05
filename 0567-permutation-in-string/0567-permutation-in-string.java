class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length() > s2.length()) return false;

       int [] count1=new int[26];

       for (char ch:s1.toCharArray()){
             count1[ch-'a']++;
       }

       int [] count2=new int[26];

       int i=0;

       while(i<s1.length()){
            count2[s2.charAt(i++)-'a']++;
       }

       if(Arrays.equals(count1,count2))  return true;

       int j=0; 
       while(i<s2.length()){
            count2[s2.charAt(j++)-'a']--;
            count2[s2.charAt(i++)-'a']++;

            if(Arrays.equals(count1,count2))    return true;
       }
       return false;
    }
}