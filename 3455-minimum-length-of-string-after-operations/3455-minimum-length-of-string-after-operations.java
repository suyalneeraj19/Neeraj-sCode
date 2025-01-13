class Solution {
    public int minimumLength(String s) {
        int length = 0;
       int [] map = new int[26];

       for(int i = 0 ; i < s.length(); i++){
            map[s.charAt(i)-'a']++;
       }

        for(int freq : map){
            if(freq == 0)   continue;

            if(freq % 2 == 0){
                length += 2;
            }else{
                length += 1;
            }
        }

        return length;

    }
}