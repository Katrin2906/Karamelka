package homework_13.task_7;

import homework_13.task_3.Mobile;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMobile { // MinMobile -> MinMobilePrice
    public static void main(String[] args) {
        List<MobilePrce> mobilePrces = new ArrayList<>();
        mobilePrces.add(new MobilePrce("Apple", "13 mini", 150));
        mobilePrces.add(new MobilePrce("Samsung", "S22 Ultra", 200));
        mobilePrces.add(new MobilePrce("Apple", "13 mini", 100));
        mobilePrces.add(new MobilePrce("Xiaomi", "Note 11", 180));
        mobilePrces.add(new MobilePrce("BlackBerry", "Bold 9000", 230));
        
        System.out.println(mobilePrces);
        
        Optional<MobilePrce> minPrice = mobilePrces.stream() // minPrice - у тебя в переменной не минимальная цена, а телефон с минимальной ценой, mobileWithLowestPrice, например
                .min(Comparator.comparing(MobilePrce::price));
        
        System.out.println(minPrice);
    }
}
