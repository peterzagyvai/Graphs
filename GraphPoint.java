import java.util.ArrayList;

public class GraphPoint {
    int x,y;
    int id;
    ArrayList<GraphEdge> connecteddEdges = new ArrayList<>();

    public GraphPoint(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }


}

