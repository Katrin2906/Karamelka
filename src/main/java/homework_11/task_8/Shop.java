package homework_11.task_8;

import java.util.Objects;

// public class Shop implements Comparable<Shop> {
public class Shop implements Comparable {
    private String name;
    private Integer ID; // ID -> id - названия полей с маленькой буквы

    public Shop(String name, Integer ID) { // ID -> id - название переменных с маленькой буквы
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

    // public int compareTo(Shop o) {
    @Override
    public int compareTo(Object o) {
        // если всегда возвращать 0, то получается у тебя все элементы одинаковые и в TreeSet попадает максимум 1 Shop, даже если у магазинов будут разные name и id
        // Посмотри как я делал на лекции
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
