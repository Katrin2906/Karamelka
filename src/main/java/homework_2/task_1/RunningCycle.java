package homework_2.task_1;

import static java.lang.System.out;

public class RunningCycle {
    public static void main(String[] args) {

        int days = 1;
        double l = 10;
        double sum = 0;

        while (days < 7) {

            l = l + (l / 10);
            sum = sum + l;

            System.out.println("Расстояние за день " + l + "км");
            days = days + 1;
        }
        System.out.println("Общее расстояние пробега " + (sum + 10) + " км");


    }

}
