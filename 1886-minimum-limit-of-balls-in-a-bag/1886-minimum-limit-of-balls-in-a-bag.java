class Solution {
    public int minimumSize(int[] nums, int max) {
        int s = 1;
        int e = Arrays.stream(nums).max().getAsInt();

        while (s < e){
            int m = s+(e-s)/2;
            int count = 0;
            for(int x : nums){
                count += (x - 1)/m;
            }
            if(count <= max)    e = m;
            else    s = m + 1;
        }

        return e;
    }
}