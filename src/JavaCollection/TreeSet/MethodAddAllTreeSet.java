package JavaCollection.TreeSet;

import java.util.TreeSet;

public class MethodAddAllTreeSet {
    public static void main(String[] args) {
        // khai báo 2 TreeSet có kiểu là Float
        TreeSet<Float> treeSet = new TreeSet<>();
        TreeSet<Float> treeSetExists = new TreeSet<>();

        // thêm vào phần tử cho treeSet và treeSetExists
        treeSet.add(5f);
        treeSet.add(8.04f);
        treeSet.add(0.2f);

        treeSetExists.add(4.4f);
        treeSetExists.add(1.9f);

        // thêm các phần tử của treeSet
        // vào treeSetExists
        treeSetExists.addAll(treeSet);

        // hiển thị treeSetExists sau khi thêm
        // các phần tử được sắp xếp tăng dần
        System.out.println("Các phần tử có trong treeSetExists là: ");
        System.out.print(treeSetExists + "\t");
    }
}
