package ComparableAndComparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployeeComparable {
    public static void main(String[] args) {
        ArrayList<Employee> a1 = new ArrayList<Employee>();
        a1.add(new Employee(1, "hùng", 22));
        a1.add(new Employee(2, "tuấn", 33));
        a1.add(new Employee(3, "quân", 23));
        a1.add(new Employee(4, "quyền", 31));
        a1.add(new Employee(5, "truyền", 33));

        Collections.sort(a1);
        for (Employee a2 : a1) {
            System.out.println(a2.getId() + " " + a2.getName() + " " + a2.getAge());
        }
    }
}
