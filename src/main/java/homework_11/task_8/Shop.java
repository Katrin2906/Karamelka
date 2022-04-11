package homework_11.task_8;

import java.util.Objects;

public class Shop implements Comparable {
    private String name;
    private Integer ID;

    public Shop(String name, Integer ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) && Objects.equals(ID, shop.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }
}
