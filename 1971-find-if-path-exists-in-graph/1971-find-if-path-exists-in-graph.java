class Solution {
   int[] dp = new int[1000001];

    public boolean hasPath(int currNode, int destNode, Map<Integer, List<Integer>> adj, boolean[] vis) {
        if (vis[currNode]) return false;
        if (currNode == destNode) return true;

        if (dp[currNode] != -1) return dp[currNode] == 1;

        vis[currNode] = true;
        for (int i = 0; i < adj.get(currNode).size(); i++) {
            if (hasPath(adj.get(currNode).get(i), destNode, adj, vis)) {
                dp[currNode] = 1;
                return true;
            }
        }
        vis[currNode] = false;

        dp[currNode] = 0;
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        boolean[] vis = new boolean[n];
        Arrays.fill(dp, -1);

        // Making adjacency list
        for (int i = 0; i < edges.length; i++) {
            int e1 = edges[i][0];
            int e2 = edges[i][1];

            adj.computeIfAbsent(e1, k -> new ArrayList<>()).add(e2);
            adj.computeIfAbsent(e2, k -> new ArrayList<>()).add(e1);
        }

        return hasPath(source, destination, adj, vis);
    }
}