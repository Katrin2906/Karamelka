package homework_12.task_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FlowersMain {
    public static void main(String[] args) {
        List<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Daisy");
        flowers.add("Poppy");
        System.out.println(flowers);
    //    flowers.forEach(fl -> System.out.println(Flowers.getName()));

     //   var sortedFlowers = flowers.stream().sorted(Comparator.comparing(Flowers::getName, Comparator.reverseOrder())).toList();

    }
}
