package homework_12.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static homework_12.task_4.User.findLetters;
import static homework_12.task_4.User.process;

public class UserMain {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Nick");
        users.add("Alla");
        users.add("Mike");
        users.add("Penny");
        users.add("Emmy");
        System.out.println(users);

        List newUsers = findLetters(users, (User u) -> u.getName().startsWith("A"));
        List newUsers1 = findLetters(users, (User u) -> u.getName().startsWith("P"));
        List newUsers2 = findLetters(users, (User u) -> u.getName().startsWith("E"));
        users.removeAll(newUsers);
        users.removeAll(newUsers1);
        users.removeAll(newUsers2);
    }
}
