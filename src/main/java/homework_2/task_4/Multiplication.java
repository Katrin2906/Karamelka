package homework_2.task_4;

public class Multiplication {
    public static void main(String[] args) {
        int m = 0; // произведение
        int a =6; // первая переменная
        int b =5; // вторая переменная
        int n = 0;

        while (n < b) {
            m = m + a;
            n = ++n;

        }
        System.out.println(m);

    }
}
