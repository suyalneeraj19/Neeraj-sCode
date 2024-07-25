class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;

    }
    static void  quickSort(int[] arr,int low,int hi) {
		if(low>=hi) {
			return;
		}
	int s=low;
	int e=hi;
	int n=s+(e-s)/2;
	int pivot=arr[n];
	
	while(s<=e) {
		while(arr[s]<pivot) {
			s++;
		}
		while(arr[e]>pivot) {
			e--;
		}
		if(s<=e) {
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
		 
	}
	 quickSort(arr,low,e);
	 quickSort(arr,s,hi);
	}
}