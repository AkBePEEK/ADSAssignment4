package Graph;

import java.util.ArrayDeque;
import java.util.Deque;

public class BreadthFirstSearch<Vertex> extends Search<Vertex>{
    private final MyGraph<Vertex> graph;

    public BreadthFirstSearch(Vertex source, MyGraph<Vertex> graph) {
        super(source);
        this.graph = graph;

        findPaths();
    }
    private void findPaths(){
        Deque<Vertex> queue = new ArrayDeque<>();
        queue.add(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            Vertex cur = queue.poll();
            for (Edge<Vertex> v : graph.adjacencyList(cur)) {
                if (!visited.contains(v)) {
                    visited.add((Vertex) v);
                    queue.add((Vertex) v);
                    edgeTo.put((Vertex) v, cur);
                }
            }
        }
    }
}
