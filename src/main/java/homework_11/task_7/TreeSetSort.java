package homework_11.task_7;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSort {

    public static void main(String[] args) {
        Set<Integer> elements = new TreeSet<>();
        for (int i = 0; i < 10; i = i + 2) {
            elements.add(i);
        }
        Set<Integer> reverse = ((TreeSet<Integer>) elements).descendingSet();
        System.out.println("Initial TreeSet " + elements);
        System.out.println("Final TreeSet " + reverse);
    }
}