class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        // Map to store the count of each card value
        Map<Integer, Integer> m = new HashMap<>();
        for (int card : hand) {
            m.put(card, m.getOrDefault(card, 0) + 1);
        }

        // Process the cards until the map is empty
        while (!m.isEmpty()) {
            int curr = Collections.min(m.keySet()); // Get the smallest card value
            // Check each consecutive sequence of groupSize cards
            for (int i = 0; i < groupSize; i++) {
                // If a card is missing or has exhausted its occurrences, return False
                if (m.getOrDefault(curr + i, 0) == 0) {
                    return false;
                }
                m.put(curr + i, m.get(curr + i) - 1);
                if (m.get(curr + i) == 0) {
                    m.remove(curr + i); // Remove the card value if its occurrences are exhausted
                }
            }
        }
        
        return true;
    }
};