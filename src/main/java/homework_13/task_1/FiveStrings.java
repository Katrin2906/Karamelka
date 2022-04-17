package homework_13.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiveStrings {
    public static void main(String[] args) {
        List<String> badBuisness = new ArrayList<>(5);
        badBuisness.add("Cassio");
        badBuisness.add("Omega");
        badBuisness.add("Breguet");
        badBuisness.add("Rolex");
        badBuisness.add("Piaget");
        System.out.println("Initial collection " + badBuisness);

        List<String> shortWord = badBuisness.stream()
                .filter(wordLength -> wordLength.length() >= 5).toList();
        System.out.println("Sorted collection " + shortWord);
    }
}
