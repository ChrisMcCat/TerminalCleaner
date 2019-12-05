package Lists;

import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        String surname1 = o1.getSurname();
        String surname2 = o2.getSurname();

        return surname1.compareTo(surname2);
    }
}