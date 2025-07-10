class Solution {
    public boolean canFinish(int V, int[][] edges) {
        List<Integer>[] adj = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] row : edges) {
            int u = row[0];
            int v = row[1];
            addEdge(adj, u, v);
        }

        return canFinish(V, adj);
    }
    private static void addEdge(List<Integer>[] adj, int u, int v) {
        adj[u].add(v);
    }

    private static boolean canFinish(int v, List<Integer>[] adj) {

        int count = 0;
        Queue<Integer> q = new LinkedList<>();

        List<Integer> inDegree = new ArrayList<>(Collections.nCopies(v, 0));

        for (int i = 0; i < v; i++) {
            for (int x : adj[i]) {
                inDegree.set(x, inDegree.get(x) + 1);
            }
        }

        for (int i = 0; i < v; i++) {
            if (inDegree.get(i) == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int u = q.poll();
            count++;

            for (int x : adj[u]) {
                inDegree.set(x, inDegree.get(x) - 1);
                if (inDegree.get(x) == 0) {
                    q.offer(x);
                }
            }
        }

        return count == v;
    }

}