class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        stack = []
        for ch in s:
            if ch == ')':
                if stack and stack[-1] == '(':
                    stack.pop()
                else:
                    stack.append(ch)
            else:
                stack.append(ch)
        return len(stack)