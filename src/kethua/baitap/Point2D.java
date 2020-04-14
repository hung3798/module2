package kethua.baitap;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float[] getXY() {
        float[] array2d = new float[2];
        array2d[0] = this.getX();
        array2d[1] = this.getY();
        return array2d;
    }

    public String toString() {
        return "This is Point 2D and have array:" + this.getXY() ;
    }
}
