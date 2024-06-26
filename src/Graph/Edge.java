package Graph;

public class Edge<Vertex> {
    private Vertex source;
    private Vertex dest;
    private Double weight;
    public Edge(Vertex source, Vertex dest){
        this.source = source;
        this.dest = dest;
        this.weight = 0d;
    }
    public Edge(Vertex source, Vertex dest, Double weight){
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Vertex getDest() {
        return dest;
    }

    public void setDest(Vertex dest) {
        this.dest = dest;
    }

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }
}
