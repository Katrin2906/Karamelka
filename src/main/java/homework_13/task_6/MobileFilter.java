package homework_13.task_6;

import homework_13.task_3.Mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MobileFilter {
    public static void main(String[] args) {
        List<Mobile> mobile = new ArrayList<>();
        mobile.add(new Mobile("Apple", "13 mini"));
        mobile.add(new Mobile("Samsung", "S22 Ultra"));
        mobile.add(new Mobile("Apple", "13 mini"));
        mobile.add(new Mobile("Xiaomi", "Note 11"));
        mobile.add(new Mobile("BlackBerry", "Bold 9000"));
        System.out.println(mobile);
        List<Mobile> newMobile = mobile.stream()
                .distinct().toList();
        System.out.println(newMobile);
    }
}
