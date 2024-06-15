
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        List<int[]> minCapital = new ArrayList<>();
        for (int i = 0; i < profits.length; i++) {
            minCapital.add(new int[]{capital[i], profits[i]});
        }
        Collections.sort(minCapital, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> maxProfit = new PriorityQueue<>((a, b) -> b - a);
        int j = 0;
        for (int i = 0; i < k; i++) {
            while (j < minCapital.size() && minCapital.get(j)[0] <= w) {
                maxProfit.offer(minCapital.get(j)[1]);
                j++;
            }

            if (maxProfit.isEmpty())
                break;

            w += maxProfit.poll();
        }

        return w;
    }
}