package homework_13.task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxLength {
    public static void main(String[] args) {
        List<String> badBuisness = new ArrayList<>(5); // badBuisness -> badBusiness
        badBuisness.add("Cassio");
        badBuisness.add("Omega");
        badBuisness.add("Breguet");
        badBuisness.add("Rolex");
        badBuisness.add("Piaget");
        System.out.println("Initial collection " + badBuisness);

        // newWord - название переменной должно отображать ее содержимое
        Optional<String> newWord = badBuisness.stream()
                .max(Comparator.naturalOrder());

        String maxLength = badBuisness.stream()
                .max(String::compareTo).get();

        System.out.println(newWord);
        System.out.println(maxLength); //только эти стримы возвращают сортировку по алфавиту

        Optional<String> realWord = badBuisness.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(realWord); // а этот по длине строки
    }
}
