package homework_2.task_3;

public class Summ {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 256) {
            sum = sum + i;
            i = i * 2;
        }
        System.out.println("Сумма равна " + sum);


    }
}