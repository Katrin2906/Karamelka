package homework_2.task_7;

public class OddNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        // твоя программа работает, но не совсем корректна. Лучше добавить if() с проверкой на нечетность, а не шагать odd + 2
        for (int odd = 1; odd <= 99; odd = odd + 2) {
            sum = sum + odd;
        }
        System.out.println("Общая сумма нечетных чисел от 1 до 99 равна " + sum);
    }
}
