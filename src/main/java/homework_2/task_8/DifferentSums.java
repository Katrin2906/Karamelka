package homework_2.task_8;

public class DifferentSums {
    public static void main(String[] args) {
        int s = 0;
        for (int e = 0; e <= 100; e = e + 2) {
            s = s + e;

        }
        System.out.println("Общая сумма четных чисел от 0 до 100 равна " + s);

        int n = 0;
        for (int d = 1; d <= 100; d = d + 2) {
            n = n + d;

        }
        System.out.println("Общая сумма нечетных чисел от 0 до 100 равна " + n);
        System.out.println("Общая сумма чисел от 0 до 100 равна " + (s + n));
    }
}
