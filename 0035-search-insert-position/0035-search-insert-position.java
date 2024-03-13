class Solution {
    public int searchInsert(int[] arr, int t) {
        int s=0;
        int e=arr.length-1;
        
        while(s<=e){
            int m=s+(e-s)/2;
            
            if(arr[m]==t){
                return m;
            }else if(t<arr[m]){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return s;
    }
}