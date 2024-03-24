class Solution {
    public int minFlips(String target) {
        int flips=0;
        char ch='0';
        
        for(char c:target.toCharArray()){
            if(c!=ch){
                flips++;
                ch=c;
            }
        }
        
        return flips;
    }
}