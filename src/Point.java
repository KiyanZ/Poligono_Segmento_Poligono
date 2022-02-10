public class Point {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
        int x = 0;
        int y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void moveTo(int x, int y) {
        Point.this.x = x;
        Point.this.y = y;
    }

    public void setOffset(int offX, int offY){
        Point.this.x = this.x + offX;
        Point.this.y = this.y + offY;
    }


}
