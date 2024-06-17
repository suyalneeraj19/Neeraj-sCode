class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        s, e = 0, int(c**0.5)
        while s <= e:
            sum = s * s + e * e
            if sum < c:
                s += 1
            elif sum > c:
                e -= 1
            else:
                return True
        return c == 1