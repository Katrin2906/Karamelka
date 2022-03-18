package homework_5.task_3;

import java.util.Arrays;

public class HouseList {
    public static void main(String[] args) {
        // Object[] -> House[]
        // если оставить Object[], то в твой массив можно положить, например строку, т.е. house[0] = "myString" будет работать, а нам это не надо
        Object[] house = new Object[4]; // house -> houses, там же несколько домов

        house[0] = new CityHouse(34, 118, true);
        house[1] = new TownHouse(2, 6, false);
        house[2] = new CityHouse(24, 81, true);
        house[3] = new CityHouse(16, 44, true);
// лишняя строка
    }
}
