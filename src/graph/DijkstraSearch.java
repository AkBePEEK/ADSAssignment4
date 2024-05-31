package graph;

public class DijkstraSearch<Vertex> extends Search<Vertex>{
    private final WeightedGraph<Vertex> graph;

    public DijkstraSearch(WeightedGraph<Vertex> graph, Vertex source) {
        super(source);
        this.graph = graph;
    }
}
