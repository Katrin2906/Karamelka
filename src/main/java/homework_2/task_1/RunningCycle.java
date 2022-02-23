package homework_2.task_1;

import static java.lang.System.out;

public class RunningCycle {
    public static void main(String[] args) {

        int d = 1; // дни
        float l = 10; //расстояние
        float s = 0; //общее расстояние

        while (d < 7) {

            l = l + (l / 10);
            s = s + l;

            System.out.println("Расстояние за день " + l + "км");
            d = d + 1;
        }
        System.out.println("Общее расстояние пробега " + (s + 10) + " км");


    }

}
