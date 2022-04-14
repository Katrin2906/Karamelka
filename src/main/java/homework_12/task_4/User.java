package homework_12.task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<String> findLetters(List<String> users, Predicate<String> predicat) {

        List<String> result = new ArrayList();

        for (String user : users)

            if (predicat.test(user))

                result.add(user);

        return result;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
