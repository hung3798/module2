package CauTrucDuLieu.BaiTap;

import kethua.thuchanh.Circle;

public class TestLikedList2 {
    public static void main(String[] args) {
        MyLikedList<Circle> circleMyLikedList = new MyLikedList<>();

        Circle circle1 = new Circle("1", true, 10);
        Circle circle2 = new Circle("2", true, 12);
        Circle circle3 = new Circle("3", true, 14);
        Circle circle4 = new Circle("4", true, 16);
        Circle circle5 = new Circle("5", true, 18);

        circleMyLikedList.addFirst(circle1);
        circleMyLikedList.addFirst(circle2);
        circleMyLikedList.addFirst(circle3);
        circleMyLikedList.addFirst(circle4);
        circleMyLikedList.addFirst(circle5);


        for (int i = 0; i < circleMyLikedList.size(); i++) {
            Circle circle = (Circle) circleMyLikedList.get(i);
            System.out.println(circle.toString());
        }

        System.out.println("------------------------------------------------------------");
        MyLikedList<Circle> cloneLinkedList = new MyLikedList<>();
        cloneLinkedList = circleMyLikedList.clone();
        for (int i = 0; i < cloneLinkedList.size(); i++) {
            Circle circle = (Circle) cloneLinkedList.get(i);
            System.out.println(circle.toString());
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println(cloneLinkedList.constrains(circle3));
        System.out.println("-------------------------------------------------------------");
        System.out.println("vi tri: " + circleMyLikedList.indexOf(circle3));
    }
}
