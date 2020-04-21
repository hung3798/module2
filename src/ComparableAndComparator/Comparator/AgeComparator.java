package ComparableAndComparator.Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        if (customer1.getAge() == customer2.getAge()) {
            return 0;
        } else if (customer1.getAge() > customer2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
