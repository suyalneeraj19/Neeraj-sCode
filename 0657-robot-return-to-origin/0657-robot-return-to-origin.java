class Solution {
    public boolean judgeCircle(String moves) {
        int x=0, y=0;
        for(char ch:moves.toCharArray()){
            if(ch=='R'){
                x++;
            }
            if(ch=='L'){
                x--;
            }
            if(ch=='U'){
                y++;
            }
            if(ch=='D'){
                y--;
            }
        }
        return (x==0) && (y==0);
    }
}