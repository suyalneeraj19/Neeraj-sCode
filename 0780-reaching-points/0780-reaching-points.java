class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while(ty>=sy && tx>=sx){
            if(tx==ty)  break ;
            
            if(tx>ty){
                if(ty>sy){
                    tx%=ty;
                }else{
                    return (tx-sx)%ty==0;
                }
            }else{
                if(tx>sx){
                    ty%=tx;
                }else{
                    return (ty-sy)%tx==0;
                }
            }
        }
        
        return (tx==sx && ty==sy);
    }
}