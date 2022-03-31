package homework_9.task_4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/homework_9/task_4/Employee");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            Employee valera = new Employee("Manager", 3, "Valera", 25);
            objectOutputStream.writeObject(valera);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

