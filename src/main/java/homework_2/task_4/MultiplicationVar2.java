package homework_2.task_4;

public class MultiplicationVar2 {
    public static void main(String[] args) {
        int n = 0;
        int a = 5;
        int b = 5;
        for (int m = 0; ; n = n + 1) {
            m = m + a;

            if (n == b) {
                break;
            }
            System.out.println(m);
        }
    }
}
