import java.util.Scanner;
import java.util.Arrays;

public class Sep6_motherVertex {
    void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int node) {
        vis[node] = true;
        for (int a : adj.get(node)) {
            if (!vis[a]) {
                dfs(adj, vis, a);
            }
        }
    }

    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        int ans_maybe = -1;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(adj, vis, i);
                ans_maybe = i;
            }
        }
        vis = new boolean[V];
        dfs(adj, vis, ans_maybe);
        for (boolean a : vis) {
            if (!a)
                return -1;
        }
        return ans_maybe;
    }
}