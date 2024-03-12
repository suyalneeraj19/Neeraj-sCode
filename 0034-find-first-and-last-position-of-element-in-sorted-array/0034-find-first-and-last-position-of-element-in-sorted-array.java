class Solution {
    public int[] searchRange(int[] arr, int t) {
        int []ans={-1,-1};
        
        ans[0]=bs(arr,t,true);
        if(ans[0]!=-1){
            ans[1]=bs(arr,t,false);
        }
        
        return ans;
    }
    
    private static int bs(int [] arr ,int t,boolean isFirst){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        
        
        
        while(s<=e){
            int m=s+(e-s)/2;
            if(t<arr[m]){
                e=m-1;
            }else if(t>arr[m]){
                s=m+1;
            }else{
                ans=m;
                if(isFirst){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }
        }
        
        return ans;
    }
}