package homework_13.task_8;

import homework_13.task_7.MobilePrce;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

//+
public class MobileProducer {
    public static void main(String[] args) {
        List<MobilePrce> mobilePrces = new ArrayList<>();
        mobilePrces.add(new MobilePrce("Apple", "13 mini", 150));
        mobilePrces.add(new MobilePrce("Samsung", "S22 Ultra", 200));
        mobilePrces.add(new MobilePrce("Apple", "13 mini", 100));
        mobilePrces.add(new MobilePrce("Xiaomi", "Note 11", 180));
        mobilePrces.add(new MobilePrce("BlackBerry", "Bold 9000", 230));
        
        System.out.println(mobilePrces);
        
        Map<String, List<MobilePrce>> findProducer = mobilePrces.stream()
                .collect(Collectors.groupingBy(MobilePrce::producer));
        
        System.out.println(findProducer);
    }
}
