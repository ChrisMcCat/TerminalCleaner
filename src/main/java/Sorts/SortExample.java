package Sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        ints.add(123);
        ints.add(1);
        ints.add(3);

        //Collections.sort(ints);
        //System.out.println(ints.toString());

        Collections.sort(ints, new IntComparator());
        System.out.println(ints.toString());

    }
}
