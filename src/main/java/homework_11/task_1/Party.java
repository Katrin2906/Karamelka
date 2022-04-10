package homework_11.task_1;

import java.util.ArrayList;
import java.util.List;

public class Party {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ann");
        names.add("Semen");
        names.add("Anasteisha");
        names.add("Valera");
        System.out.println(names);
        if (names.contains(NewName.NewName())) {
            System.out.println("Come in");
        } else System.out.println("Sorry,try to visit us next time");
    }
}



