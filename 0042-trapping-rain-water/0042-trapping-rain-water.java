class Solution {
    public int trap(int[] A) {
        int s = 0 , e = A.length - 1 , sMax = A[s] , eMax = A[e] ,tot = 0;

        while(s < e){
            if(A[s] < A[e]){
                sMax = Math.max(sMax , A[s]);
                if(sMax - A[s] > 0){
                    tot += sMax - A[s];
                }
                s++;
            }else{
                eMax = Math.max(eMax , A[e]);
                if(eMax - A[e] > 0){
                    tot += eMax - A[e];
                }
                e--;
            }
        }

        return tot;
    }
}