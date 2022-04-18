package homework_13.task_3;

import java.util.*;
import java.util.stream.Collectors;

public class MobileSort {
    public static void main(String[] args) {
        List<Mobile> mobile = new ArrayList<>();
        mobile.add(new Mobile("Apple", "13 Pro"));
        mobile.add(new Mobile("Samsung", "S22 Ultra"));
        mobile.add(new Mobile("Apple", "13 mini"));
        mobile.add(new Mobile("Xiaomi", "Note 11"));
        mobile.add(new Mobile("BlackBerry", "Bold 9000"));
        System.out.println(mobile);

       Set<String> producers = mobile.stream()
                .map(Mobile::producer)
                .collect(Collectors.toSet());
        System.out.println(producers);

        Set<String> newProducers=Set.of("Apple","Samsung","Xiaomi");

       List<String> anyProd= producers.stream()
               .filter("Apple"::equals)
               .toList();
        System.out.println(anyProd);

    }
}
