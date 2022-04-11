package homework_11.task_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FruitsStorage {
    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<>();
        fruits.add(new Fruits("bananas", 12));
        fruits.add(new Fruits("pineapple", 6));
        fruits.add(new Fruits("apricots", 5));
        fruits.add(new Fruits("bananas", 30));
        fruits.add(new Fruits("bananas", 6));
        fruits.add(new Fruits("apricots", 32));

        Map<String, Object> mapFruits = fruits.stream().collect(Collectors.toMap(Fruits::getName, fruits1 -> fruits));

        System.out.println(mapFruits);

    }
}
