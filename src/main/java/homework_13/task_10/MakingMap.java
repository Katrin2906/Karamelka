package homework_13.task_10;

import homework_13.task_3.Mobile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MakingMap {
    public static void main(String[] args) {
        List<Mobile> mobile = new ArrayList<>();
        mobile.add(new Mobile("Apple", "13 mini"));
        mobile.add(new Mobile("Samsung", "S22 Ultra"));
        mobile.add(new Mobile("Apple", "13 mini"));
        mobile.add(new Mobile("Xiaomi", "Note 11"));
        mobile.add(new Mobile("BlackBerry", "Bold 9000"));
        
        System.out.println(mobile);

        Map<String, Integer> newMap = mobile.stream() // newMap -> byProducersCounting, не забивай на название переменных
                .collect(Collectors.toMap(Mobile::producer, Mobile.Collectors.groupingBy(mob -> mob, Collectors.counting())));
        
        newMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
