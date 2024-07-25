class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length);
        return nums;
    }

    static void mergeSort(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }

        int m=s+(e-s)/2;

        mergeSort(arr,s,m);
        mergeSort(arr,m,e);

         merge(arr,s,m,e);
    }

    static void merge(int[] arr,int s,int m,int e){
        int i=s,j=m,k=0;
        int [] mix=new int[e-s];

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k++]=arr[i++];
            }else{
                mix[k++]=arr[j++];
            }
        }

        while(i<m){
            mix[k++]=arr[i++];
        }
        while(j<e){
            mix[k++]=arr[j++];
        }

        //System.arraycopy(mix,0,arr,0,mix.length);
        for (int l = 0; l < mix.length; l++) {
      arr[s + l] = mix[l];
    }
    }
}