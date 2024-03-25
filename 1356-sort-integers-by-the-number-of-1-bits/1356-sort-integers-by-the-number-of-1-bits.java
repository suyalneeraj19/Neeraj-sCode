class Solution {
    public int[] sortByBits(int[] arr) {
  // create a 2D array to store the arr in sorted form in row 1 and int bit Count in row 2
        
    // sort the array beforehand storing it in the matrix
        Arrays.sort(arr);
        
        int [][] ans=new int[arr.length][2];
        
        for(int i=0;i<arr.length;i++){
            ans[i][0]=arr[i];
            ans[i][1]=Integer.bitCount(arr[i]);
        }
    // After storing sort it comparing the Bitcount using inbult Compaare Function
        
        Arrays.sort(ans,Comparator.comparingDouble(o -> o[1]));
        
     // Store the sorted ans in original arr
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i][0];
        }
        
        return arr;
    }
}