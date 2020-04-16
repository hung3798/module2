package CauTrucDuLieu.BaiTap;

import kethua.thuchanh.Circle;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLikedList<Circle> circleMyLikedList = new MyLikedList<>();
        Circle circle = new Circle("khong", true, 34.4);
        Circle circle1 = new Circle("mot", true, 53);
        Circle circle2 = new Circle("hai", true, 24);
        Circle circle3 = new Circle("ba", true, 75);
        Circle circle4 = new Circle("bon", true, 23);
        Circle circle5 = new Circle("nam", true, 98);

        circleMyLikedList.addFirst(circle3);
        circleMyLikedList.addFirst(circle2);
        circleMyLikedList.addLast(circle1);
        circleMyLikedList.addLast(circle5);
        circleMyLikedList.remove(3);
        circleMyLikedList.remove(circle3);

        for (int i = 0; i < circleMyLikedList.size(); i++) {
            Circle circle6 = (Circle) circleMyLikedList.get(i);
            System.out.println(circle6.toString());
        }
    }
}
