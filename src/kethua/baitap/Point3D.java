package kethua.baitap;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y) {
        super(x, y);
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        float[] array3D = new float[3];
        array3D[0] = this.getX();
        array3D[1] = this.getY();
        array3D[2] = this.getZ();
        return array3D;
    }

    public String toString() {
        return "this is Point 3D and have array: " + this.getXYZ();
    }
}
