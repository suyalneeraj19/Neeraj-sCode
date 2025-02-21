class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        int l = (int)Math.pow(2,n);
        int [] freq =new int[l];

        for(String num : nums){
            int ans = Integer.parseInt(num, 2);
            freq[ans]++;
        }
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] == 0){
                StringBuilder ans = new StringBuilder(Integer.toBinaryString(i));
                    while (ans.length() < n) {
                            ans.insert(0, '0');
                                }
                                return ans.toString();
            }
        }

        return "";



    }
}