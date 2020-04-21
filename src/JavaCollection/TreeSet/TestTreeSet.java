package JavaCollection.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();

//        TreeSet<Character> characterTreeSet = new TreeSet<>(new HashSet<>());
        TreeSet<Character> characterTreeSet = new TreeSet<>();

        characterTreeSet.add('R');
        characterTreeSet.add('A');
        characterTreeSet.add('B');
        characterTreeSet.add('C');
        characterTreeSet.add('N');
        characterTreeSet.add('X');
        characterTreeSet.add('M');

        System.out.println("Các phần tử có trong treeSet là: " + characterTreeSet);
        integerTreeSet.add(5);
        integerTreeSet.add(9);
        integerTreeSet.add(4);
        integerTreeSet.add(2);

        System.out.println("Các phần tử của treeSetInteger là: ");
        for (int number : integerTreeSet) {
            System.out.print(number + "\t");
        }
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("C#");
        treeSet.add("Java");
        treeSet.add("PHP");
        treeSet.add("SQL");
        treeSet.add("HTML");
        treeSet.add("CSS");

        // khai báo một Iterator có kiểu là String
        Iterator<String> iterator = treeSet.iterator();

        // hiển thị các phần tử có trong treeSet
        // bằng cách sử dụng Iterator
        System.out.println("\nCác phần tử có trong treeSet là: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
}
