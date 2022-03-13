package homework_4.task_1;

import java.util.Objects;

public class Dwarfs {
    private String name;
    private String age;


    public Dwarfs(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Dwarfs() {
        this("Балин", "231");
    }

    public String dwarfName() {
        return name;
    }

    public String dwarfAge() {
        return age;
    }

    public String show() {
        return " Name: " + name + " Age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dwarfs dwarfs = (Dwarfs) o;
        return Objects.equals(name, dwarfs.name) && Objects.equals(age, dwarfs.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Dwarfs{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
