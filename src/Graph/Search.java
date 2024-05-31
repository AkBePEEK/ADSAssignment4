package Graph;

import java.util.*;

public class Search<Vertex>{
    Set<Vertex> visited = new HashSet<>();
    Map<Vertex, Vertex> edgeTo = new HashMap<>();
    final Vertex source;
    public Search(Vertex source){
        this.source = source;
    }
    private Iterable<Vertex> pathTo(Vertex dest){
        if (!hasPathTo(dest)) return null;
        List<Vertex> track = new ArrayList<>();

        for (Vertex i = dest; i != null; i = edgeTo.get(i)) track.add(i);

        return track;
    }
    public boolean hasPathTo(Vertex dest){
        return visited.contains(dest);
    }
}
