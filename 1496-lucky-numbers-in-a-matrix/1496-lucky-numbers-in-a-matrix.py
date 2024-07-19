class Solution:
    def luckyNumbers(self, matrix):
        n = len(matrix)
        m = len(matrix[0])
        lucky_numbers = []

        for i in range(n):
            num = float('inf')
            index = -1

            # Find the minimum number in the current row
            for j in range(m):
                if matrix[i][j] < num:
                    num = matrix[i][j]
                    index = j

            # Check if this number is the maximum in its column
            flag = True
            for row in range(n):
                if matrix[row][index] > num:
                    flag = False
                    break

            if flag:
                lucky_numbers.append(num)

        return lucky_numbers