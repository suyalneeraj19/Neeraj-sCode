
class Solution {
    public  int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        // Store all prefixes of numbers in arr1
        for (int s : arr1) {
            int n = s;
            while (n > 0) {
                mp.put(n, mp.getOrDefault(n, 0) + 1);
                n /= 10;
            }
        }
        
        int maxi = 0;
        
        // Check for common prefixes in arr2
        for (int s : arr2) {
            int n = s;
            int count = (int)(Math.log10(n) + 1);
            while (n > 0) {
                if (mp.containsKey(n)) {
                    maxi = Math.max(count, maxi);
                }
                n /= 10;
                count--;
            }
        }
        
        return maxi;
    }
}