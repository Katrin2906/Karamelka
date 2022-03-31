package homework_9.task_4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee extends Work implements Serializable {
    private static final long serialVersionUID = -72801047642231177L;
    public String name;
    private Integer age;

    public Employee(String position, Integer minWorkExperience, String name, Integer age) {
        super(position, minWorkExperience);
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' + ',' +
                "age='" + age + '\'' + ',' + "position='" + getPosition() + '\'' + ',' + "minWorkExperience='" + getMinWorkExperience() + '\'' +
                '}';
    }
}

