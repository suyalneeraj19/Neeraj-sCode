class Solution {
    public List<List<Integer>> threeSum(int[] A) {
        int n = A.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(A);

        for(int i = 0 ; i < n && A[i] <= 0; i++){
            if(i == 0 || A[i] != A[i-1]){
                solve(res , i , A);
            }
        }
        return res;
    }

    static void solve(List<List<Integer>> res , int i , int [] A){

        int s = i +1 , e = A.length - 1;

        while(s < e){
            int sum = A[i] + A[s] + A[e];

            if(sum < 0){
                s++;
            }else if(sum > 0){
                e--;
            }else{
                res.add(Arrays.asList(A[s++] , A[i] , A[e--]));

                while(s < e && A[s] == A[s-1]){
                    s++;
                }

            }
        }
    }
}