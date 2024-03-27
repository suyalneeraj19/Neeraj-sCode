class Solution {
    public String originalDigits(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        int[] nums = new int[10];
        for (char ch : s.toCharArray()) {
            if (ch == 'z') nums[0]++;
            if (ch == 'w') nums[2]++;
            if (ch == 'u') nums[4]++;
            if (ch == 'x') nums[6]++;
            if (ch == 'g') nums[8]++;
            if (ch == 'h') nums[3]++;
            if (ch == 'f') nums[5]++;
            if (ch == 's') nums[7]++;
            if (ch == 'o') nums[1]++;
            if (ch == 'i') nums[9]++;
        }

        nums[3] -= nums[8];
        nums[5] -= nums[4];
        nums[7] -= nums[6];
        nums[1] -= nums[0] + nums[2] + nums[4];
        nums[9] -= nums[6] + nums[8] + nums[5];

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i]; j++) {
                res.append(i);
            }
        }
        return res.toString(); 
    }
}