package Graph;


import java.util.List;

public class WeightedGraph<Vertex> extends MyGraph<Vertex>{
    public WeightedGraph(){
        super();
    }
    public WeightedGraph(boolean undirected){
        super(undirected);
    }

    @Override
    public void addVertex(Vertex v) {
        super.addVertex(v);
    }

    public void addEdge(Vertex src, Vertex dest, double weight) {
        if (weight < 0) throw new IllegalArgumentException("Weight cannot be negative");
        super.addEdge(src, dest, weight);
    }

    @Override
    public int getVerticesCount() {
        return super.getVerticesCount();
    }

    @Override
    public int getEdgesCount() {
        return super.getEdgesCount();
    }
    @Override
    public boolean hasEdge(Vertex source, Vertex dest) {
        return super.hasEdge(source, dest);
    }
    @Override
    public boolean hasVertex(Vertex v) {
        return super.hasVertex(v);
    }

    @Override
    public List<Edge<Vertex>> adjacencyList(Vertex v) {
        return super.adjacencyList(v);
    }
}
