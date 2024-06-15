import heapq

class Solution:
    def findMaximizedCapital(self, k: int, w: int, profits: list, capital: list) -> int:
        projects = sorted(zip(capital, profits), key=lambda x: x[0])
        max_heap = []
        i = 0
        for _ in range(k):
            while i < len(projects) and projects[i][0] <= w:
                heapq.heappush(max_heap, -projects[i][1])
                i += 1
            if max_heap:
                w -= heapq.heappop(max_heap)
            else:
                break
        return w