package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph<Vertex>{
    private final boolean inderected;
    private final Map<Vertex, List<Edge<Vertex>>> graph;

    public MyGraph(){
        this(false);
    }

    public MyGraph(boolean indirected) {
        this.inderected = indirected;
        graph = new HashMap<>();
    }

    public void addVertex(Vertex v){
        graph.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(Vertex from, Vertex to){
        if (!graph.containsKey(from)) addVertex(from);
        if (!graph.containsKey(to)) addVertex(to);

        graph.get(from).add(new Edge<>(from, to));
        if (inderected) graph.get(to).add(new Edge<>(to, from));
    }
    public int getVerticesCount(){
        return graph.size();
    }
    public int getEdgeCount(){
        return graph.values().size() / 2;
    }
    public boolean hasVertex(Vertex v){
        return graph.containsKey(v);
    }
    public boolean hasEdge(Vertex from, Vertex to){
        return graph.get(from).contains(to);
    }
    public List<Edge<Vertex>> adjacencyList(Vertex v){
        if (!hasVertex(v)) return null;

        return graph.get(v);
    }
}
