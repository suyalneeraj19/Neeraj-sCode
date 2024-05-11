import java.util.Arrays;
import java.util.PriorityQueue;

class Worker {
    int quality;
    int wage;

    public Worker(int quality, int wage) {
        this.quality = quality;
        this.wage = wage;
    }
}

class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Worker[] workers = new Worker[n];

        for (int i = 0; i < n; i++) {
            workers[i] = new Worker(quality[i], wage[i]);
        }

        Arrays.sort(workers, (a, b) -> Double.compare((double) a.wage / a.quality, (double) b.wage / b.quality));

        double minCost = Double.MAX_VALUE;
        int totalQuality = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (Worker worker : workers) {
            totalQuality += worker.quality;
            maxHeap.offer(worker.quality);

            if (maxHeap.size() > k) {
                totalQuality -= maxHeap.poll();
            }

            if (maxHeap.size() == k) {
                minCost = Math.min(minCost, totalQuality * ((double) worker.wage / worker.quality));
            }
        }

        return minCost;
    }
}