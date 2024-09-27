class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // If str1 + str2 is not equal to str2 + str1, there is no common divisor
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the greatest common divisor of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring of str1 that represents the GCD string
        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
