package homework_11.task_1;

import java.util.Scanner;

public class NewName {

    public static String NewName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, please");
        String name = scanner.nextLine();
        return name;
    }
}
