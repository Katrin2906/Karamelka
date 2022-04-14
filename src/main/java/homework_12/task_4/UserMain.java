package homework_12.task_4;

import java.util.ArrayList;
import java.util.List;

import static homework_12.task_4.User.process;

public class UserMain {
    public static void main(String[] args) {
        List<String> users=new ArrayList<>();
        users.add("Nick");
        users.add("Alla");
        users.add("Mike");
        users.add("Penny");
        users.add("Emmy");
        System.out.println(users);

        List newUsers = process(users, (User u) -> u.getName().equals("A"));
    }
}
