package kethua.thuchanh;

public class Cylinder extends Circle {
    double height = 5;

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public Cylinder() {
    }

    public Cylinder(String color, boolean filled) {
        super(color, filled);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, boolean filled, double radius, double height) {
        super(color, filled, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public String toString() {
        return "A Cylinder with radius="
                + getRadius()
                +" and height=" + height
                + ", which is a subclass of "
                + super.toString();
    }
}
