package JavaCollection.TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Subset {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(1);
        integerTreeSet.add(2);
        integerTreeSet.add(3);
        integerTreeSet.add(4);
        integerTreeSet.add(5);
        integerTreeSet.add(6);
        integerTreeSet.add(7);
        integerTreeSet.add(8);
        integerTreeSet.add(9);
        integerTreeSet.add(10);

        System.out.println("các phần tử có trong treeset:");
        System.out.println(integerTreeSet);
        System.out.println("ta có subset từ phần tử thứ 3 đến thứ 9 là:");
        SortedSet<Integer> subSet = integerTreeSet.subSet(3, 9);
        System.out.println(subSet);
        System.out.println("ta có subset từ phần tử thứ 5 đến thứ 9 là:");
        subSet = integerTreeSet.subSet(5, 9);
        System.out.println(subSet);
        subSet = integerTreeSet.subSet(5, 5);
        System.out.println("từ 5 đến 5 là:");
        System.out.println(subSet);
    }
}
