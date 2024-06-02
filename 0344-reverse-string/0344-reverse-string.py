class Solution:
    def reverseString(self, s: List[str]) -> None:
        self.reverseHelper(s, 0, len(s) - 1)

    def reverseHelper(self, s: List[str], left: int, right: int) -> None:
        if left < right:
            s[left], s[right] = s[right], s[left]
            self.reverseHelper(s, left + 1, right - 1)