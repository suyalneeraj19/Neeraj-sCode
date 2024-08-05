class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0) return false;
        return x == rev(x);
    }

private:
    long long rev(int x) {
        if (x == 0) return 0; // Handle the special case for 0
        int digits = static_cast<int>(log10(x)) + 1;
        return helper(x, digits);
    }

    long long helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * static_cast<long long>(pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
};
