package homework_2.task_1;

public class Running2 {
    public static void main(String[] args) {
        int d = 1;
        float l = 10;
        float s = 0;
        do {
            System.out.println("Расстояние за " + d + " день " + l + " км");
            d = d + 1;
            l = l + l / 10;
            s = s + l;
        } while (d <= 7);
        System.out.println("Общее расстояние " + (s - 10) + "км");
    }
}
