package Graph;

import java.util.*;

public class DijkstraSearch<Vertex> extends Search<Vertex>{
    private final WeightedGraph<Vertex> graph;
    private final Map<Vertex, List<Edge<Vertex>>> distances = new HashMap<>();
    private final Set<Vertex> unsettledNodes = new HashSet<>();

    public DijkstraSearch(WeightedGraph<Vertex> graph, Vertex source) {
        super(source);
        this.graph = graph;
    }
    public void dijkstra(){

    }
    private double getDistances(){

    }
    private Vertex getVertexWithMinimumWeight(){

    }
    private double getShortestDistances(){

    }
}
