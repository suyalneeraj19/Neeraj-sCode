class Solution:
    def maximumImportance(self, n: int, roads: List[List[int]]) -> int:
        COUNT = [0] * n  # i-th city has COUNT[i] roads
        for A,B in roads:
            COUNT[A] += 1 # Each road increase the road count
            COUNT[B] += 1
        COUNT.sort()  # Cities with most road should receive the most score
        summ = 0
        for i in range(len(COUNT)):
            summ += COUNT[i] * (i+1)  # Multiply city roads with corresponding score
        
        return summ