package homework_2.task_8;

public class DifferentSums {
    // ты решила задачу при помощи двух циклов. Подумай как решить ее при помощи только одного, т.к. такая программа будет работать гораздо быстрее.
    // подсказка в комментарии к задаче 6,7
    public static void main(String[] args) {
        int sum_even = 0; // название переменной sum_even -> sumEven
        for (int even = 0; even <= 100; even = even + 2) {
            sum_even = sum_even + even;

        }
        System.out.println("Общая сумма четных чисел от 0 до 100 равна " + sum_even);

        int sum_odd = 0;
        for (int odd = 1; odd <= 100; odd = odd + 2) {
            sum_odd = sum_odd+odd;
        }
        System.out.println("Общая сумма нечетных чисел от 0 до 100 равна " + sum_odd);
        System.out.println("Общая сумма чисел от 0 до 100 равна " + (sum_even + sum_odd));
    }
}
