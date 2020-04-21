package JavaCollection.TreeSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ClearTreeSet {
    public static void main(String[] args) {
        int Number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        // thêm các phần tử vào treeSetInteger
        treeSetInteger.add(7);
        treeSetInteger.add(19);
        treeSetInteger.add(1);
        treeSetInteger.add(20);

        // xóa toàn bộ các phần tử trong treeSetInteger
        // sử dụng phương thức clear()
        treeSetInteger.clear();

        // sau khi xóa thì trong treeSetInteger
        // sẽ không có phần tử nào
        // phương thức isEmpty() dưới đây sẽ kiểm tra
        // nếu treeSetInteger không có giá trị
        // thì sẽ hiển thị thông báo "Không có phần tử"
        if (treeSetInteger.isEmpty()) {
            System.out.println("Không có phần tử.");
        }
    }
}
