class Solution {
    public int minimumLength(String s) {
        if(s.length() < 2)  return s.length();
        int length = 0;
        HashMap<Character,Integer> map = new HashMap<>();

       for(int i = 0 ; i < s.length(); i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }

        for(int freq : map.values()){
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