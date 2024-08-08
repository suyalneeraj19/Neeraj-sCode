class Solution:
    def spiralMatrixIII(self, rows: int, cols: int, rStart: int, cStart: int) -> list[list[int]]:
        matrix = [[0, 0] for _ in range(rows * cols)]
        k = 0
        directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
        dir = 0
        steps = 1

        while k < len(matrix):
            for i in range(steps):
                if 0 <= rStart < rows and 0 <= cStart < cols:
                    matrix[k] = [rStart, cStart]
                    k += 1
                rStart += directions[dir][0]
                cStart += directions[dir][1]
            dir = (dir + 1) % 4
            if dir % 2 == 0:
                steps += 1

        return matrix