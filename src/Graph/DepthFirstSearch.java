package Graph;

import java.security.Provider;

public class DepthFirstSearch<Vertex> extends Search<Vertex> {

    public DepthFirstSearch(MyGraph<Vertex> graph, Vertex source) {
        super(source);

        DFS(source, graph);
    }
    private void DFS(Vertex source, MyGraph<Vertex> graph){
        visited.add(source);

        for (Edge<Vertex> v : graph.adjacencyList(source)){
            if (!visited.contains(source)){
                edgeTo.put((Vertex) v, source);
                DFS((Vertex) v, graph);
            }
        }
    }
}
