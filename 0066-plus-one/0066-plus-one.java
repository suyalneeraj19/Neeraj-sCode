class Solution {
    public int[] plusOne(int[] digits) {
        // Traverse from the last digit to the first
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, we can just add 1 and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If we are here, it means all the digits were 9, so we need an extra digit at the front
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Set the first element to 1 (e.g., [9,9] becomes [1,0,0])
        
        return newDigits;
    }
}
