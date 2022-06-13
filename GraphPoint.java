import java.util.ArrayList;

public class GraphPoint {
    public static final int Radius = 5;
    private int x,y;
    private int id;
    ArrayList<GraphEdge> connecteddEdges = new ArrayList<>();

    public GraphPoint(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getId(){
        return id;
    }
}

