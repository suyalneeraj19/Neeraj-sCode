class Solution {
    public int findJudge(int n, int[][] trust) {
        List<Integer> data = new ArrayList<>(Collections.nCopies(n+1 , 0));

        for(int [] t : trust ){
            data.set(t[0],data.get(t[0])-1);
            data.set(t[1] , data.get(t[1])+1);
        }

        for( int i = 1 ; i <= n ; i++){
            if(data.get(i) == n-1){
                return i;
            }
        }

        return -1;
    }
}