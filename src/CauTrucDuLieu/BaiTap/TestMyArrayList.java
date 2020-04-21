package CauTrucDuLieu.BaiTap;

import kethua.thuchanh.Circle;

public class TestMyArrayList {
    public static void main(String[] args) {
        Circle circle1 = new Circle("1", true, 15);
        Circle circle2 = new Circle("2", true, 6);
        Circle circle3 = new Circle("3", false, 76);
        Circle circle4 = new Circle("4", true, 33);
        Circle circle5 = new Circle("5", true, 23);
        Circle circle6 = new Circle("6", true, 23);
        Circle circle7 = new Circle("7", true, 23);

        MyArrayList<Circle> circleMyArrayList = new MyArrayList<>();
        circleMyArrayList.add(circle1);
        circleMyArrayList.add(circle2);
        circleMyArrayList.add(circle3);
        circleMyArrayList.add(circle4);
        circleMyArrayList.add(circle5);
        circleMyArrayList.add(circle6,3);
        circleMyArrayList.remove(2);

        for (int i = 0; i < circleMyArrayList.size(); i++) {
            System.out.println(circleMyArrayList.elements[i].toString());
        }
//        System.out.println(circleMyArrayList.size());
//        System.out.println(circleMyArrayList.indexOf(circle3));
//        System.out.println(circleMyArrayList.contains(circle7));
//
        MyArrayList<Circle> circleMyArrayList1 = new MyArrayList<>();
//
        circleMyArrayList1 = circleMyArrayList.clone();
//
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < circleMyArrayList1.size(); i++) {
            System.out.println(circleMyArrayList1.elements[i].toString());
        }
    }
}
