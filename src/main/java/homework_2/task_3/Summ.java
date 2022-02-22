package homework_2.task_3;

public class Summ {
    public static void main(String[] args) {
        int i = 1;
        int s = 0;
        while (i <= 256) {
            s = s + i;
            i = i * 2;
        }
        System.out.println("Сумма равна " + s);


    }
}