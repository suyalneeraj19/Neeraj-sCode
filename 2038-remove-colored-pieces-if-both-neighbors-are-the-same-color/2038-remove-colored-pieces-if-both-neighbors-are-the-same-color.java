class Solution {
    public boolean winnerOfGame(String colors) {
        // if(colors.length()<=2){ return false;}
        int a=0,b=0;
        for(int i=1;i<colors.length()-1;i++){
            if(colors.charAt(i)=='A'){
                if(colors.charAt(i-1)=='A'  && colors.charAt(i+1)=='A') a++;
            }else{
                if(colors.charAt(i-1)=='B'  && colors.charAt(i+1)=='B') b++;
            }
        }

        return (a>b);
    }
}