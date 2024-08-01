class Solution:
    def countSeniors(self, s):
        ans = 0
        for ss in s:
            a1 = int(ss[11])  # Get the 12th character as an integer
            a2 = int(ss[12])  # Get the 13th character as an integer
            if (a1 * 10) + a2 > 60:
                ans += 1
        return ans