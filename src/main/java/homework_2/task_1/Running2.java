package homework_2.task_1;

public class Running2 {
    public static void main(String[] args) {
        int days = 1;
        double l = 10;
        double sum = 0;
        do {
            System.out.println("Расстояние за " + days + " день " + l + " км");
            days = days + 1;
            l = l + l / 10;
            sum = sum + l;
        } while (days <= 7);
        System.out.println("Общее расстояние " + (sum - 10) + "км");
    }
}
