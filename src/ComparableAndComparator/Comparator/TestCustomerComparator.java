package ComparableAndComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestCustomerComparator {
    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
        customerArrayList.add(new Customer(1, "hung", 21));
        customerArrayList.add(new Customer(2, "tuan", 13));
        customerArrayList.add(new Customer(3, "anh", 44));
        customerArrayList.add(new Customer(4, "sau", 16));
        customerArrayList.add(new Customer(5, "dit me may", 8));

        System.out.println("sorting by name:");
        Collections.sort(customerArrayList, new NameComparator());
        for (Customer st : customerArrayList) {
            System.out.println(st.getId() + " " + st.getName() + " " + st.getAge());
        }

        Collections.sort(customerArrayList,new AgeComparator());
        System.out.println("sorting by age:");
        for (Customer st : customerArrayList) {
            System.out.println(st.getAge() + " " + st.getName() + " " + st.getAge());
        }
    }
}
