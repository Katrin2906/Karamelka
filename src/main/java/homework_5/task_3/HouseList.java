package homework_5.task_3;

import java.util.Arrays;

public class HouseList {
    public static void main(String[] args) {
        Object[] house = new Object[4];

        house[0] = new CityHouse(34, 118, true);
        house[1] = new TownHouse(2, 6, false);
        house[2] = new CityHouse(24, 81, true);
        house[3] = new CityHouse(16, 44, true);

    }
}
