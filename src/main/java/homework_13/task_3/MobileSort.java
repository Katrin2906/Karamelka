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

        Set<String> newProducers=Set.of("Apple","Samsung","Xiaomi"); // ты этот список никак не используешь в своем коде

       /* stream() каждый раз проходит по всей коллекции, как цикл. Когда ты дважды делаешь стрим, ты дважды проходишь по коллекции, 
       а все операции можно сделать за 1 раз
       
       Пример:
       List<String> filteredProducers = mobile.stream()
                .map(Mobile::producer)
                .filter(producer -> newProducers.contains(producer))
                .collect(Collectors.toList());
       */
       List<String> anyProd= producers.stream()
               .filter("Apple"::equals)
               .toList();
        System.out.println(anyProd);

    }
}
