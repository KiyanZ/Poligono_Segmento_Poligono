public class Point {
    private int x;
    private int y;

    public Point() {
        int x = 0;
        int y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "( " + x + "," + y + ")";
    }

     void moveTo(int x,int y){
        Point.this.x = x;
        Point.this.y = y;
    }

}
