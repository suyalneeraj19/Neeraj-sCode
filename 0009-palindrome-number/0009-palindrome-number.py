import math

class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        return x == self.rev(x)

    def rev(self, x: int) -> int:
        if x == 0:  # Handle the special case for 0
            return 0
        digits = int(math.log10(x)) + 1
        return self.helper(x, digits)

    def helper(self, n: int, digits: int) -> int:
        if n % 10 == n:
            return n
        rem = n % 10
        return rem * (10 ** (digits - 1)) + self.helper(n // 10, digits - 1)
