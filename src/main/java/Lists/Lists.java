package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {


        java.util.List<Person> persons_arrayList = new ArrayList<>();
        java.util.List<Person> persons_linkedList = new LinkedList<>();


        Person p1 = new Person("Przemek", "Grzesiowski");
        Person p2 = new Person("Alicja", "Nowak");
        Person p3 = new Person("Tomasz", "Grzesiowski");

        persons_arrayList.add(p1);
        persons_arrayList.add(p2);
        persons_arrayList.add(p3);

        System.out.println(persons_arrayList.indexOf(p1));

        persons_arrayList.remove(2);
        for (Person person : persons_arrayList) {
            System.out.println(person.getFirstname() + " " + person.getSurname());
        }


/*
        for (Person person : persons_arrayList) {
            System.out.println(person.getFirstname() + " " + person.getSurname());

        }*/


        //System.out.println(persons_arrayList.size());

    }
}
