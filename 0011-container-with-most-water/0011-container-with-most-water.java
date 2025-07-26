class Solution {
    public int maxArea(int[] A) {
        int s = 0 , e = A.length - 1 , h = 0 , max = 0;

        while(s < e){
            h = Math.min(A[s],A[e]);
            int area = h * (Math.abs(e-s));
            max = Math.max(area, max);
            if(A[s] <= h){
                s++;
            }else{
                e--;
            }
        }

        return max;
    }
}