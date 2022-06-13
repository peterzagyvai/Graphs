public class GraphEdge {
    private GraphPoint pointA, pointB;
    private int id;

    public GraphEdge(GraphPoint pointA, GraphPoint pointB, int id) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.id = id;
    }
    public GraphPoint getPointA(){
        return pointA;
    }
    public GraphPoint getPointB(){
        return pointB;
    }
}
