package JavaCollection.TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class HeadSet {
    public static void main(String[] args) {
        TreeSet<Character> treeSetChar = new TreeSet<>();

        // thêm các phần tử vào trong treeSetChar
        treeSetChar.add('V');
        treeSetChar.add('A');
        treeSetChar.add('B');
        treeSetChar.add('C');
        treeSetChar.add('G');
        treeSetChar.add('E');

        System.out.println("Các phần tử có trong treeSetChar: ");
        System.out.println(treeSetChar);

        // khai báo 1 SortedSet có tên là headset
        // có các phần tử được trích xuất
        // từ phần tử đầu tiên đến
        // phần tử đứng trước phần tử 'E' trong treeSetChar
        SortedSet<Character> headset = treeSetChar.headSet('E');
        System.out.println("Các phần tử có trong headset: ");
        System.out.println(headset);
    }
}
