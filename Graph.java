import java.awt.*;
import java.util.ArrayList;

public class Graph {
    public ArrayList<GraphPoint> points;
    ArrayList<GraphEdge> edges;
    int pointId, edgeId;

    public Graph() {
        points = new ArrayList<>();
        edges = new ArrayList<>();
        pointId = 0;
        edgeId = 0;
    }

    //POINTS:

    public void addPoint(GraphPoint point){
        points.add(point);
        pointId++;
    }

    public GraphPoint getPointById(int id){
        for (GraphPoint point:points){
            if (id == point.getId()) {
                return point;
            }
        }
        return null;
    }


    //EDGES:
    public void addEdge(GraphEdge edge){
        edges.add(edge);
        edgeId++;
    }

    public void drawGraph(Graphics2D g){
        for (GraphPoint point:points) {
            int radius = GraphPoint.Radius;
            int startX = point.getX() - radius;
            int startY = point.getY() - radius;
            g.fillRoundRect(startX,startY, 2*radius, 2*radius,2*radius,2*radius);
        }
        for (GraphEdge edge:edges){
            GraphPoint pointA = edge.getPointA();
            GraphPoint pointB = edge.getPointB();
            g.drawLine(pointA.getX(),pointA.getY(),pointB.getX(),pointB.getY());
        }
    }
}

