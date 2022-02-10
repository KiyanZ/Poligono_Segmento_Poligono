public class Segment {
    private Point startPoint;

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    private Point endPoint;

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Segment() {
        Point Point1 = new Point(0, 0);
        Point Point2 = new Point(0, 0);
    }

    public Segment(Point startPoint, Point endPoint) {
    }

    public double distance(Point startPoint, Point endPoint) {
        double distancia = Math.sqrt(((startPoint.getX() - startPoint.getY()) * 2) + ((endPoint.getX()) - (endPoint.getY()) * 2));
        return distancia;
    }

    public void setOffset(int offX, int offY) {

    }

}
