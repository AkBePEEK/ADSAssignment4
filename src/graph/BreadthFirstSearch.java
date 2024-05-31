package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<Vertex> extends Search<Vertex>{
    private final Queue<Vertex> queue = new LinkedList<>();

    public BreadthFirstSearch(Vertex source) {
        super(source);
    }
}
