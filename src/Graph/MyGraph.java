package Graph;

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
    public void addEdge(Vertex source, Vertex dest){
        addEdge(source, dest, 0);
    }

    public void addEdge(Vertex source, Vertex dest, double weight){
        if (!hasVertex(source)) addVertex(source);
        if (!hasVertex(dest)) addVertex(dest);

        if (hasEdge(source, dest) || source.equals(dest)) return;
        graph.get(source).add(new Edge<>(source, dest));
        if (inderected) graph.get(dest).add(new Edge<>(dest, source, weight));
    }
    public int getVerticesCount(){
        return graph.size();
    }
    public int getEdgesCount(){
        return graph.values().size() / 2;
    }
    public boolean hasVertex(Vertex v){
        return graph.containsKey(v);
    }
    public boolean hasEdge(Vertex source, Vertex dest){
        return graph.get(source).contains(dest);
    }
    public List<Edge<Vertex>> adjacencyList(Vertex v){
        if (!hasVertex(v)) return null;

        return graph.get(v);
    }
}
