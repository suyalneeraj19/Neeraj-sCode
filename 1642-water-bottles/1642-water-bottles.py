class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        ans = numBottles
        while numBottles >= numExchange:
            empty_bottles = numBottles
            numBottles = empty_bottles // numExchange
            ans += numBottles
            empty_bottles = empty_bottles % numExchange
            numBottles += empty_bottles
        return ans