package kethua.thuchanh;

public class CircleResizeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("before resize");
        System.out.println(circle.getArea());
        circle.resize(7);
        System.out.println("after resize");
        System.out.println(circle.getArea());
    }
}
