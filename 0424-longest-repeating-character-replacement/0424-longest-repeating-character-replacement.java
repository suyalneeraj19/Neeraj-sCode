class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq = new int[26];

        int left = 0 , ans = 0 , max = 0;

        for(int right = 0 ; right < s.length() ; right++){
            max = Math.max(max ,++freq[s.charAt(right) - 'A']);
            if( right - left + 1 - max > k){
                
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans , right - left + 1);
        }

        return ans;
    }
}