import java.util.ArrayList;
import java.util.List;

public class Sep5_printAdjList {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] row : edges){
            int x = row[0];
            int y = row[1];
            adjList.get(x).add(y);
            adjList.get(y).add(x);
        }
        return adjList;
    }
}
