package CauTrucDuLieu.ThucHanh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class JavaCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("pham thai hung");
        collection.add("le ngoc huy");
        collection.add("tran anh tuan");
        collection.add("nguyen quang huy");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase()+ " ");
        }
    }
}
