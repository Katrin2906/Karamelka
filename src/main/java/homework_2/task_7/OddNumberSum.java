package homework_2.task_7;

public class OddNumberSum {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            s = s + i;
        }
        System.out.println("Общая сумма нечетных чисел от 1 до 99 равна " + s);
    }
}