class Solution {
    public int maxTwoEvents(int[][] events) {
        int eventCount = events.length;
        Arrays.sort(events, (event1, event2) -> event1[0] - event2[0]);
        
        int[] maxSuffixValues = new int[eventCount];
        maxSuffixValues[eventCount - 1] = events[eventCount - 1][2];
        
        for (int index = eventCount - 2; index >= 0; --index) {
            maxSuffixValues[index] = Math.max(events[index][2], maxSuffixValues[index + 1]);
        }
        
        int maximumSum = 0;
        
        for (int currentIndex = 0; currentIndex < eventCount; ++currentIndex) {
            int leftIndex = currentIndex + 1, rightIndex = eventCount - 1;
            int nextEventIndex = -1;
            
            while (leftIndex <= rightIndex) {
                int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
                if (events[midIndex][0] > events[currentIndex][1]) {
                    nextEventIndex = midIndex;
                    rightIndex = midIndex - 1;
                } else {
                    leftIndex = midIndex + 1;
                }
            }
            
            if (nextEventIndex != -1) {
                maximumSum = Math.max(maximumSum, events[currentIndex][2] + maxSuffixValues[nextEventIndex]);
            }
            
            maximumSum = Math.max(maximumSum, events[currentIndex][2]);
        }
        
        return maximumSum;

    }
}