class Solution {
    public int maximumCount(int[] arr) {
       int c1=0,c2=0;
       int s=0;
       int e=arr.length-1;

       while(s<=e){
        int m=s+(e-s)/2;
        if(arr[m]<0) s=m+1;
        else e=m-1;
       }
       c1=s;
       s=0;e=arr.length-1;
       while(s<=e){
        int m=s+(e-s)/2;
        if(arr[m]>0) e=m-1;
        else s=m+1;
       }

       c2=arr.length-s;
       return Math.max(c1,c2);
    }
}
