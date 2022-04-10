package homework_11.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            numbers.add(0, i);
        }
        String text = String.format("Initial list %s", numbers);
        System.out.println(text);

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        String finalText = String.format("Final list %s", numbers);
        System.out.println(finalText);
    }
}