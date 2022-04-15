package homework_12.task_6;

// класс идеально подходит чтобы быть record
public class Flowers {

    private final String name;

    public Flowers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "name='" + name + '\'' +
                '}';
    }
}

