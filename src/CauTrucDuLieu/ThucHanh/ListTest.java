package CauTrucDuLieu.ThucHanh;

public class ListTest {
    public static void main(String[] args) {
        MyList<Integer> listIntegers = new MyList<Integer>();
        listIntegers.add(1);
        listIntegers.add(2);
        listIntegers.add(3);
        listIntegers.add(4);
        listIntegers.add(5);
        listIntegers.add(6);

        System.out.println("element 4: " + listIntegers.get(4));
        System.out.println("element 1: " + listIntegers.get(1));
        System.out.println("element 3: " + listIntegers.get(3));
        System.out.println("element 2: " + listIntegers.get(2));
        System.out.println("element 6: " + listIntegers.get(-1));
    }
}
