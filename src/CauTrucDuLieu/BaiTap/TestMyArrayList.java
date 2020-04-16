package CauTrucDuLieu.BaiTap;

import kethua.thuchanh.Circle;

public class TestMyArrayList {
    public static void main(String[] args) {
        Circle circle1 = new Circle("blue", true, 15);
        Circle circle2 = new Circle("yellow", true, 6);
        Circle circle3 = new Circle("black", false, 76);
        Circle circle4 = new Circle("green", true, 33);
        Circle circle5 = new Circle("red", true, 23);
        Circle circle6 = new Circle("limited", true, 23);
        Circle circle7 = new Circle("limited", true, 23);

        MyArrayList<Circle> circleMyArrayList = new MyArrayList<>();
        circleMyArrayList.add(circle1);
        circleMyArrayList.add(circle2);
        circleMyArrayList.add(circle3);
        circleMyArrayList.add(circle4);
        circleMyArrayList.add(circle5);
        circleMyArrayList.add(circle6,3);

        for (int i = 0; i < circleMyArrayList.size(); i++) {
            System.out.println(circleMyArrayList.elements[i].toString());
        }
        System.out.println(circleMyArrayList.size());
        System.out.println(circleMyArrayList.indexOf(circle3));
        System.out.println(circleMyArrayList.contains(circle7));

        MyArrayList<Circle> circleMyArrayList1 = new MyArrayList<>();

        circleMyArrayList1 = circleMyArrayList.clone();

        for (int i = 0; i < circleMyArrayList1.size(); i++) {
            System.out.println(circleMyArrayList1.elements[i].toString());
        }
    }
}
